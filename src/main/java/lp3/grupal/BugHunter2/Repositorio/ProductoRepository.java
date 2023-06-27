/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lp3.grupal.BugHunter2.Repositorio;

import java.util.List;
import lp3.grupal.BugHunter2.Models.Empresa;
import lp3.grupal.BugHunter2.Models.Marca;
import lp3.grupal.BugHunter2.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto,Long> {
    List<Producto> findAllByMarca(Marca marca);
    List<Producto> findAllByEmpresa(Empresa empresa);
}
