/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3.grupal.BugHunter2.dto;

/**
 *
 * @author YOII
 */
public class UsuarioRegistroDTO {
    private Long u_id;
    private String u_nombre;
    private String u_correo;
    private String u_contrasena;

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }

    public String getU_nombre() {
        return u_nombre;
    }

    public void setU_nombre(String u_nombre) {
        this.u_nombre = u_nombre;
    }

    public String getU_correo() {
        return u_correo;
    }

    public void setU_correo(String u_correo) {
        this.u_correo = u_correo;
    }

    public String getU_contrasena() {
        return u_contrasena;
    }

    public void setU_contrasena(String u_contrasena) {
        this.u_contrasena = u_contrasena;
    }

    public UsuarioRegistroDTO(Long u_id, String u_nombre, String u_correo, String u_contrasena) {
        this.u_id = u_id;
        this.u_nombre = u_nombre;
        this.u_correo = u_correo;
        this.u_contrasena = u_contrasena;
    }

    public UsuarioRegistroDTO(String u_nombre, String u_correo, String u_contrasena) {
        this.u_nombre = u_nombre;
        this.u_correo = u_correo;
        this.u_contrasena = u_contrasena;
    }

    public UsuarioRegistroDTO(String u_correo) {
        this.u_correo = u_correo;
    }

    public UsuarioRegistroDTO() {
    }
    
    
}
