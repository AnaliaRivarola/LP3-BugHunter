/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3.grupal.BugHunter2.Service;

import lp3.grupal.BugHunter2.Models.Usuario;
import lp3.grupal.BugHunter2.dto.UsuarioRegistroDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author YOII
 */
public interface UsuarioService extends UserDetailsService{
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
}
