package lp3.grupal.BugHunter2.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long u_id;
    @Basic
    private String u_nombre;
    private String u_correo;
    private String u_contrasena;
    
    @ManyToOne
    @JoinColumn(name="p_empresa")
    Empresa empresa;
    
    
    
    @ManyToMany(mappedBy="usuarios",fetch=FetchType.LAZY)
    private Set<Rol> roles;

    public Usuario() {
    }

    public Usuario(Long u_id, String u_nombre, String u_correo, String u_contrasena, Empresa empresa, Set<Rol> roles) {
        this.u_id = u_id;
        this.u_nombre = u_nombre;
        this.u_correo = u_correo;
        this.u_contrasena = u_contrasena;
        this.empresa = empresa;
        this.roles = roles;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

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

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

}
