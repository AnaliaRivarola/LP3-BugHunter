/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter2.Controllers;
import lp3.grupal.BugHunter2.Models.Empresa;
import lp3.grupal.BugHunter2.Repositorio.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller 
@RequestMapping(value="/empresas")
public class EmpresaController {
    @Autowired 
    private EmpresaRepository empresa_repo;
    
    @GetMapping(value="/")
    public String  index(Model model)
    {
        var empresas = empresa_repo.findAll();
        model.addAttribute("empresas", empresas);
        model.addAttribute("vista", "empresas/lista");
        model.addAttribute("fragmento", "empresaslista");
        return "index";
    }
    
    
    @GetMapping("/nuevo")
    public String nuevo(Model model, Empresa empresa){
        model.addAttribute("vista", "empresas/formAgg");
        model.addAttribute("fragmento", "empresasformAgg");
        return "index";
    }
    
    @GetMapping("/editar/{e_id}")
    public String editar(Model model, Empresa empresa){
        empresa=empresa_repo.findById(empresa.getE_id()).orElse(null);
        model.addAttribute("empresa", empresa);
        model.addAttribute("vista", "empresas/formAgg");
        model.addAttribute("fragmento", "empresasformAgg");
        return "index";
    }
    
    @GetMapping("/borrar/{e_id}")
    public String borrar(Empresa empresa){
        empresa_repo.delete(empresa);
        return "redirect:/empresas/";
    }
    
    @PostMapping("/guardar")
    public String guardar(Empresa empresa)
    {  
        empresa_repo.save(empresa);
        return "redirect:/empresas/";
    }  
}
