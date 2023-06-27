package lp3.grupal.BugHunter2.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import org.springframework.stereotype.Service;
@Service 
@Entity
@Table (name="empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="e_id")
    private Long e_id;
    @Basic
    
    @Column (name="e_nombre")
    private String e_nombre;
    
    @Column (name="e_direccion")
    private String e_direccion;
    
    @Column (name="e_telefono")
    private String e_telefono;
    
    @OneToMany(targetEntity=Usuario.class, cascade=CascadeType.ALL)
    @JoinColumn(name="u_empresa_id", referencedColumnName="e_id")
    private List<Usuario> usuario;
    
    @OneToMany(targetEntity=Producto.class, cascade=CascadeType.ALL)
    @JoinColumn(name="p_empresa_id", referencedColumnName="e_id")
    private List<Producto> productos;
    


    public Empresa() {
    }

    public Empresa(Long e_id, String e_nombre, String e_direccion, String e_telefono, List<Usuario> usuario, List<Producto> productos) {
        this.e_id = e_id;
        this.e_nombre = e_nombre;
        this.e_direccion = e_direccion;
        this.e_telefono = e_telefono;
        this.usuario = usuario;
        this.productos = productos;
    }

    

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    

    public Long getE_id() {
        return e_id;
    }

    public void setE_id(Long e_id) {
        this.e_id = e_id;
    }

    public String getE_nombre() {
        return e_nombre;
    }

    public void setE_nombre(String e_nombre) {
        this.e_nombre = e_nombre;
    }

    public String getE_direccion() {
        return e_direccion;
    }

    public void setE_direccion(String e_direccion) {
        this.e_direccion = e_direccion;
    }

    public String getE_telefono() {
        return e_telefono;
    }

    public void setE_telefono(String e_telefono) {
        this.e_telefono = e_telefono;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

   
}
