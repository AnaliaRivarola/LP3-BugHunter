/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author anali
 */

        @Entity
@Table(name="rol")
public class Rol {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="r_id")
    private Long r_id;
    
    @Column(name="r_nombre")
    private String r_nombre;
    
   /* @ManyToMany(mappedBy="r_rol",cascade = CascadeType.ALL, fetch= FetchType.LAZY)
    @JsonIgnore
    private List<Usuario> r_usuario;*/
}
