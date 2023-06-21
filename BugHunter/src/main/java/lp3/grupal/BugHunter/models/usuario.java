/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
import java.util.List;

/**
 *
 * @author anali
 */
         @Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String u_nombre;
    private String u_correo;
    private String u_contrasena;
    
    @ManyToOne
    @JoinColumn(name = "u_empresa")
    private Empresa u_empresa;
    
    /*@ManyToMany (mappedBy="r_rol",cascade = CascadeType.ALL, fetch= FetchType.LAZY)
    @JsonIgnore
    private List<Rol> u_rol;*/
    
    public Usuario() {
    }

    public Usuario(Long id, String u_nombre, String u_correo, String u_contrasena, Empresa empresa, List<Rol> u_rol) {
        this.id = id;
        this.u_nombre = u_nombre;
        this.u_correo = u_correo;
        this.u_contrasena = u_contrasena;
        this.u_empresa = u_empresa;
        //this.u_rol = u_rol;
    }

   

    public Long getId() {
        return id;
    }

    public String getU_nombre() {
        return u_nombre;
    }

    public String getU_correo() {
        return u_correo;
    }

    public String getU_contrasena() {
        return u_contrasena;
    }

   /* public List<Rol> getU_rol() {
        return u_rol;
    }*/

    public void setId(Long id) {
        this.id = id;
    }

    public void setU_nombre(String u_nombre) {
        this.u_nombre = u_nombre;
    }

    public void setU_correo(String u_correo) {
        this.u_correo = u_correo;
    }

    public void setU_contrasena(String u_contrasena) {
        this.u_contrasena = u_contrasena;
    }

   /* public void setU_rol(List<Rol> u_rol) {
        this.u_rol = u_rol;
    }*/

    public Empresa getU_empresa() {
        return u_empresa;
    }

    public void setU_empresa(Empresa u_empresa) {
        this.u_empresa = u_empresa;
    }


    
    
    
}
