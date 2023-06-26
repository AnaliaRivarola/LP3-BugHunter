/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lp3.grupal.BugHunter2.Repositorio;

import lp3.grupal.BugHunter2.Models.Empresa;
import lp3.grupal.BugHunter2.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository <Producto,Long> {
    
}
