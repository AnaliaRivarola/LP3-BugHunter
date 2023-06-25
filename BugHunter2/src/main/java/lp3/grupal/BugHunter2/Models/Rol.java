package lp3.grupal.BugHunter2.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name="rol")
public class Rol {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long r_id;
    @Basic
    private String r_nombre;
    @ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinTable(name="rol_usuario_table",
            joinColumns={
                @JoinColumn(name="r_usuarios",referencedColumnName="r_id")
            },
            inverseJoinColumns={
                @JoinColumn(name="u_roles",referencedColumnName="u_id")
            }
            )
    private Set<Usuario> usuarios;

    public Rol() {
    }

    public Rol(Long r_id, String r_nombre, Set<Usuario> usuarios) {
        this.r_id = r_id;
        this.r_nombre = r_nombre;
        this.usuarios = usuarios;
    }

    public Long getR_id() {
        return r_id;
    }

    public void setR_id(Long r_id) {
        this.r_id = r_id;
    }

    public String getR_nombre() {
        return r_nombre;
    }

    public void setR_nombre(String r_nombre) {
        this.r_nombre = r_nombre;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
