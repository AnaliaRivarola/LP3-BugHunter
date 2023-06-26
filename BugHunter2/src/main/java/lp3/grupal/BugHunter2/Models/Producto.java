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

@Entity 
@Table(name="producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name="p_id")
    private Long p_id;
    
    @Basic
    @Column(name = "p_nombre")
    private String p_nombre;

    @Column(name = "p_descripcion")
    private String p_descripcion;

    @ManyToOne
    @JoinColumn(name = "p_marca_id")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "p_empresa_id")
    private Empresa empresa;

    @Column(name = "p_pantalla")
    private String p_pantalla;

    @Column(name = "p_almacenamiento")
    private String p_almacenamiento;

    @Column(name = "p_ram")
    private String p_ram;

    @Column(name = "p_sistema_operativo")
    private String p_sistemaOperativo;

    @Column(name = "p_procesador")
    private String p_procesador;

    public Producto() {
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getP_pantalla() {
        return p_pantalla;
    }

    public void setP_pantalla(String p_pantalla) {
        this.p_pantalla = p_pantalla;
    }

    public String getP_almacenamiento() {
        return p_almacenamiento;
    }

    public void setP_almacenamiento(String p_almacenamiento) {
        this.p_almacenamiento = p_almacenamiento;
    }

    public String getP_ram() {
        return p_ram;
    }

    public void setP_ram(String p_ram) {
        this.p_ram = p_ram;
    }

    public String getP_sistemaOperativo() {
        return p_sistemaOperativo;
    }

    public void setP_sistemaOperativo(String p_sistemaOperativo) {
        this.p_sistemaOperativo = p_sistemaOperativo;
    }

    public String getP_procesador() {
        return p_procesador;
    }

    public void setP_procesador(String p_procesador) {
        this.p_procesador = p_procesador;
    }

    public Producto(Long p_id, String p_nombre, String p_descripcion, Marca marca, Empresa empresa, String p_pantalla, String p_almacenamiento, String p_ram, String p_sistemaOperativo, String p_procesador) {
        this.p_id = p_id;
        this.p_nombre = p_nombre;
        this.p_descripcion = p_descripcion;
        this.marca = marca;
        this.empresa = empresa;
        this.p_pantalla = p_pantalla;
        this.p_almacenamiento = p_almacenamiento;
        this.p_ram = p_ram;
        this.p_sistemaOperativo = p_sistemaOperativo;
        this.p_procesador = p_procesador;
    }

}
