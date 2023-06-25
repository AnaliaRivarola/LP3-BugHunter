/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter2.Models;

/*import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;*/

/**
 *
 * @author anali
*/
public class Producto {

    private Long p_id;
    
 
    private String p_nombre;
    

    private String p_descripcion;
    

    Marca p_marca;
    

    Empresa p_empresa;

    private String p_tam_pant;
    

    private String p_mem_alma;
    

    private String p_mem_ram;

    private String p_so;
    

    private String p_procesador;
    

    private String p_bateria;

   
    
     
}
