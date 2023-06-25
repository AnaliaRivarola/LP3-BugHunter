package lp3.grupal.BugHunter2.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity (name="productos")
@Table(name="producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name="p_id")
    private Long p_id;
    
    @Basic
    @Column(name="p_nombre")
    private String p_nombre;
    @Column(name="p_descripcion")
    private String p_descripcion;
    @Column(name="p_tam_pant")
    private String p_tam_pant;
    @Column(name="p_mem_alma")
    private String p_mem_alma;
    @Column(name="p_mem_ram")
    private String p_mem_ram;
    @Column(name="p_so")
    private String p_so;
    @Column(name="p_procesador")
    private String p_procesador;
    @Column(name="p_bateria")
    private String p_bateria;
    @ManyToOne
    @JoinColumn(name="p_marca")
    Marca marca;
    
    @ManyToOne
    @JoinColumn(name="p_empresa")
    Empresa empresa;
    public Producto() {
    }

    public Producto(Long p_id, String p_nombre, String p_descripcion, String p_tam_pant, String p_mem_alma, String p_mem_ram, String p_so, String p_procesador, String p_bateria, Marca marca, Empresa empresa) {
        this.p_id = p_id;
        this.p_nombre = p_nombre;
        this.p_descripcion = p_descripcion;
        this.p_tam_pant = p_tam_pant;
        this.p_mem_alma = p_mem_alma;
        this.p_mem_ram = p_mem_ram;
        this.p_so = p_so;
        this.p_procesador = p_procesador;
        this.p_bateria = p_bateria;
        this.marca = marca;
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    

    public Long getP_id() {
        return p_id;
    }

    public void setP_id(Long p_id) {
        this.p_id = p_id;
    }

    public String getP_nombre() {
        return p_nombre;
    }

    public void setP_nombre(String p_nombre) {
        this.p_nombre = p_nombre;
    }

    public String getP_descripcion() {
        return p_descripcion;
    }

    public void setP_descripcion(String p_descripcion) {
        this.p_descripcion = p_descripcion;
    }

    public String getP_tam_pant() {
        return p_tam_pant;
    }

    public void setP_tam_pant(String p_tam_pant) {
        this.p_tam_pant = p_tam_pant;
    }

    public String getP_mem_alma() {
        return p_mem_alma;
    }

    public void setP_mem_alma(String p_mem_alma) {
        this.p_mem_alma = p_mem_alma;
    }

    public String getP_mem_ram() {
        return p_mem_ram;
    }

    public void setP_mem_ram(String p_mem_ram) {
        this.p_mem_ram = p_mem_ram;
    }

    public String getP_so() {
        return p_so;
    }

    public void setP_so(String p_so) {
        this.p_so = p_so;
    }

    public String getP_procesador() {
        return p_procesador;
    }

    public void setP_procesador(String p_procesador) {
        this.p_procesador = p_procesador;
    }

    public String getP_bateria() {
        return p_bateria;
    }

    public void setP_bateria(String p_bateria) {
        this.p_bateria = p_bateria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
     
}
