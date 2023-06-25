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

@Entity (name="Marcas")
@Table(name="marca")
public class Marca {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long m_id;
    
    @Basic
    @Column (name="m_nombre")
    private String m_nombre;
    
    @OneToMany(targetEntity=Producto.class, cascade=CascadeType.ALL)
    @JoinColumn(name="m_productos", referencedColumnName="m_id")
    private List<Producto> productos;

    public Marca() {
    }

    public Marca(Long m_id, String m_nombre, List<Producto> productos) {
        this.m_id = m_id;
        this.m_nombre = m_nombre;
        this.productos = productos;
    }

    public Long getM_id() {
        return m_id;
    }

    public void setM_id(Long m_id) {
        this.m_id = m_id;
    }

    public String getM_nombre() {
        return m_nombre;
    }

    public void setM_nombre(String m_nombre) {
        this.m_nombre = m_nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
