/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter2.Controllers;

import java.util.List;
import lp3.grupal.BugHunter2.Models.Empresa;
import lp3.grupal.BugHunter2.Models.Producto;
import lp3.grupal.BugHunter2.Repositorio.EmpresaRepository;
import lp3.grupal.BugHunter2.Repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author anali
 */

@Service
@Controller
@RequestMapping(value="/empresas/producto")
public class ProductosController {
 

    @Autowired 
    private ProductoRepository producto_repo;
    
    @GetMapping(value="/")
    public String  index(Model model)
    {
        var producto = producto_repo.findAll();
        model.addAttribute("producto", producto);
        model.addAttribute("vista", "productos/lista");
        model.addAttribute("fragmento", "productoLista");
        return "index";
    }
    
    
    @GetMapping("/nuevo")
    public String nuevo(Model model, Producto producto){
        model.addAttribute("vista", "productos/formAgg");
        model.addAttribute("fragmento", "productoformAgg");
        return "index";
    }
    
    @GetMapping("/editar/{p_id}")
    public String editar(Model model, Producto producto){
        producto=producto_repo.findById(producto.getP_id()).orElse(null);
        model.addAttribute("producto",producto);
        model.addAttribute("vista", "productos/formAgg");
        model.addAttribute("fragmento", "productoformAgg");
        return "index";
    }
    
    @GetMapping("/borrar/{p_id}")
    public String borrar(Producto producto){
        producto_repo.delete(producto);
        return "redirect:/empresas/producto/";
    }
    
    @PostMapping("/guardar")
    public String guardar(Producto producto)
    {  
        producto_repo.save(producto);
        return "redirect:/empresas/producto/";
    }  
    
    
    @Autowired
    private EmpresaRepository empresaRepository;
    @GetMapping("/empresas/producto")
    public String mostrarFormulario(Model model) {
        List<Empresa> empresas = empresaRepository.findAll();
        model.addAttribute("empresas", empresas);
        return "/empresas/producto";
    }
}


