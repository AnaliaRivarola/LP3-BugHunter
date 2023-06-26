package lp3.grupal.BugHunter2.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="u_id")
    private Long u_id;
    @Basic
    @Column(name = "u_nombre")
    private String u_nombre;
     @Column(name = "u_correo_electronico")
    private String u_correo;
    @Column(name = "u_contrasena")
    private String u_contrasena;
    
    @ManyToOne
    @JoinColumn(name="u_empresa_id")
    private Empresa empresa;
    
    @ManyToMany
    @JoinTable(
        name = "Usuario_Rol",
        joinColumns = @JoinColumn(name = "ur_usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "ur_rol_id")
    )
    private List<Rol> roles;

    public Usuario() {
    }

    public Usuario(Long u_id, String u_nombre, String u_correo, String u_contrasena, Empresa empresa, List<Rol> roles) {
        this.u_id = u_id;
        this.u_nombre = u_nombre;
        this.u_correo = u_correo;
        this.u_contrasena = u_contrasena;
        this.empresa = empresa;
        this.roles = roles;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    
}
