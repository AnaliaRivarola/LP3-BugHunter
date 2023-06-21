/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lp3.grupal.BugHunter.repositories;

import java.io.Serializable;
import lp3.grupal.BugHunter.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author anali
 */
public interface UsuarioRepository extends JpaRepository <Usuario, Serializable>{
    
}
