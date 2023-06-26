package lp3.grupal.BugHunter2.Controllers;

import lp3.grupal.BugHunter2.Models.Marca;
import lp3.grupal.BugHunter2.Repositorio.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller 
@RequestMapping(value="/marcas")
public class MarcaController {
    @Autowired 
    private MarcaRepository marca_repo;
    
    @GetMapping(value="/")
    public String  index(Model model)
    {
        var marcas = marca_repo.findAll();
        model.addAttribute("marcas", marcas);
        model.addAttribute("vista", "marcas/lista");
        model.addAttribute("fragmento", "marcaslista");
        return "index";
    }
    
    
    @GetMapping("/nuevo")
    public String nuevo(Model model, Marca marca){        
        model.addAttribute("marcas", marca);
        model.addAttribute("vista", "marcas/formAgg");
        model.addAttribute("fragmento", "marcasformAgg");
        return "index";
    }
    
    @GetMapping("/editar/{e_id}")
    public String editar(Model model, Marca marca){
        marca=marca_repo.findById(marca.getM_id()).orElse(null);
        model.addAttribute("marcas", marca);
        model.addAttribute("vista", "marcas/formAgg");
        model.addAttribute("fragmento", "marcasformAgg");
        return "index";
    }
    
    @GetMapping("/borrar/{e_id}")
    public String borrar(Marca marca){
        marca_repo.delete(marca);
        return "redirect:/marcas/";
    }
    
    @PostMapping("/guardar")
    public String guardar(Marca marca)
    {  
        marca_repo.save(marca);
        return "redirect:/marcas/";
    }
}
