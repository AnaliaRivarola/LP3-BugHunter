/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter2.Models;

/*import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;*/

/**
 *
 * @author anali
 */

public class Usuario {

    private Long id;
    private String u_nombre;
    private String u_correo;
    private String u_contrasena;

    private Empresa u_empresa;
    
    /*@ManyToMany (mappedBy="r_rol",cascade = CascadeType.ALL, fetch= FetchType.LAZY)
    @JsonIgnore
    private List<Rol> u_rol;*/
    
  
    
    
}
