/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3.grupal.BugHunter2.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import lp3.grupal.BugHunter2.Models.Rol;
import lp3.grupal.BugHunter2.Models.Usuario;
import lp3.grupal.BugHunter2.Repositorio.UsuarioRepository;
import lp3.grupal.BugHunter2.dto.UsuarioRegistroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author YOII
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository user_repo;
    private BCryptPasswordEncoder passwordEncoder;
    
    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getU_nombre(),
                registroDTO.getU_correo(),
                passwordEncoder.encode(registroDTO.getU_contrasena()),
                Arrays.asList(new Rol("ROLE_USER")));
		return user_repo.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = user_repo.findByEmail(username);
        if(usuario == null){
            throw new UsernameNotFoundException("Usuario o contraseña inválidos");
        }
        return new User(usuario.getU_correo(), usuario.getU_contrasena(), mapearAutoridadesRoles(usuario.getRoles()));
    }
    
    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getR_nombre())).collect(Collectors.toList());
	}

}
