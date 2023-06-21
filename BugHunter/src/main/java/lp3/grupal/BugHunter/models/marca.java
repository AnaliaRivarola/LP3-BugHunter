/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="marca")
public class Marca {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="m_id")
    private Long m_id;
    
    @Column(name="m_nombre")
    private String m_nombre;
    
    @OneToMany (mappedBy="p_marca") //nombre del ManyToOne
    List<Producto> productoList;

    public Marca() {
    }

    
    public Marca(Long m_id, String m_nombre, List<Producto> productoList) {
        this.m_id = m_id;
        this.m_nombre = m_nombre;
        this.productoList = productoList;
    }

    public Long getM_id() {
        return m_id;
    }

    public String getM_nombre() {
        return m_nombre;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setM_id(Long m_id) {
        this.m_id = m_id;
    }

    public void setM_nombre(String m_nombre) {
        this.m_nombre = m_nombre;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    
    
}
