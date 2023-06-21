/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 *
 * @author anali
 */

        @Entity
@Table(name="rol")
public class rol {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String r_nombre;
    private String r_usuario;

    public rol() {
    }

    public rol(Long id, String r_nombre, String r_usuario) {
        this.id = id;
        this.r_nombre = r_nombre;
        this.r_usuario = r_usuario;
    }

    public Long getId() {
        return id;
    }

    public String getR_nombre() {
        return r_nombre;
    }

    public String getR_usuario() {
        return r_usuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setR_nombre(String r_nombre) {
        this.r_nombre = r_nombre;
    }
    
    @ManyToMany
    @JoinTable(
  name = "rol_usuario", 
  joinColumns = @JoinColumn(name = "u_id"), 
  inverseJoinColumns = @JoinColumn(name = "r_id"))
    public void setR_usuario(String r_usuario) {
        this.r_usuario = r_usuario;
    }
    
}
