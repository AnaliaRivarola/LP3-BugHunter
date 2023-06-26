/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter2.Controllers;
import java.util.List;
import lp3.grupal.BugHunter2.Models.Empresa;
import lp3.grupal.BugHunter2.Models.Usuario;
import lp3.grupal.BugHunter2.Repositorio.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author anali
 */
@Service
@Controller 
public class EmpresaController {
    @Autowired 
    private EmpresaRepository empresa_repo;
    
    @GetMapping(value="/")
    public String  index(Model modelo)
    {
        var empresas = empresa_repo.findAll();
        modelo.addAttribute("empresas", empresas);
        return "index";
    }
    
    @GetMapping("/nuevo")
    public String nuevo(Empresa empresa)
    {
        return "form";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(Empresa empresas, Model modelo)
    {
        var eid=empresas.getE_id();
        empresas=empresa_repo.findById(eid).orElse(null);
        modelo.addAttribute("empresas", empresas);
        return "form";
    }
    
     @GetMapping("/guardar")
    public String guardar(Empresa empresa)
    {
        empresa_repo.save(empresa);
        return "redirect:/";
    }
    
     @GetMapping("/borrar/{id}")
    public String borrar(Empresa empresa)
    {
      
        return "redirect:/";
    }
    
    private final EmpresaRepository empresaRepository;

    public EmpresaController(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }
    
    public List<Empresa> obtenerEmpresaConUsuario() {
        return empresaRepository.findAll();
    }
    
    public String obtenerEmpresas(Model model)
    {
        /*List<Empresa> empresas = EmpresaController.obtenerEmpresaConUsuario();
        for(Empresa empresa : empresas)
        {
            Usuario usuario = empresa.getUsuario();
            String nombreUsuario = empresa.get
        }*/
        
        /*Tratando de relacionar la tabla de usuario con empresa*/
    }
}
