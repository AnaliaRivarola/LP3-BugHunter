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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author anali
 */
     @Entity
@Table(name="producto")
public class Producto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="p_id")
    private Long p_id;
    
    @Column(name="p_nombre")
    private String p_nombre;
    
    @Column(name="p_descripcion")
    private String p_descripcion;
    
    @ManyToOne
    @JoinColumn(name="p_marca")
    Marca p_marca;
    
    @ManyToOne
    @JoinColumn(name="p_empresa")
    Empresa p_empresa;
    
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

   
    
     
}
