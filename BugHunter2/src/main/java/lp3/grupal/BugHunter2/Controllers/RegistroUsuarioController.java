/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3.grupal.BugHunter2.Controllers;

import lp3.grupal.BugHunter2.Service.UsuarioService;
import lp3.grupal.BugHunter2.dto.UsuarioRegistroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author YOII
 */
@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
            return new UsuarioRegistroDTO();
	}

	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "formRegistro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuarioService.guardar(registroDTO);
		return "redirect:/registro?exito";
	}
}
