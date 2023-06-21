        
package lp3.grupal.BugHunter.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author anali
 */  
@Entity
@Table(name="empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long e_id;
    private String e_nombre;
    private String e_direccion;
    private String e_telefono;
    private String e_productos;
    
     @OneToMany (mappedBy="u_empresa") //nombre del ManyToOne
     List<Usuario> usuarioList;
    

    public Empresa() {
    }

    public Empresa(Long e_id, String e_nombre, String e_direccion, String e_telefono, String e_productos, List<Usuario> usuarioList) {
        this.e_id = e_id;
        this.e_nombre = e_nombre;
        this.e_direccion = e_direccion;
        this.e_telefono = e_telefono;
        this.e_productos = e_productos;
        this.usuarioList = usuarioList;
    }

    public Long getE_id() {
        return e_id;
    }

    public String getE_nombre() {
        return e_nombre;
    }

    public String getE_direccion() {
        return e_direccion;
    }

    public String getE_telefono() {
        return e_telefono;
    }

    public String getE_productos() {
        return e_productos;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setE_id(Long e_id) {
        this.e_id = e_id;
    }

    public void setE_nombre(String e_nombre) {
        this.e_nombre = e_nombre;
    }

    public void setE_direccion(String e_direccion) {
        this.e_direccion = e_direccion;
    }

    public void setE_telefono(String e_telefono) {
        this.e_telefono = e_telefono;
    }

    public void setE_productos(String e_productos) {
        this.e_productos = e_productos;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

   

    
}
