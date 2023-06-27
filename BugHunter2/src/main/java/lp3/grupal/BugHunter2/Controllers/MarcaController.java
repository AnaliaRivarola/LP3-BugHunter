package lp3.grupal.BugHunter2.Controllers;

import java.util.List;
import lp3.grupal.BugHunter2.Models.Marca;
import lp3.grupal.BugHunter2.Models.Producto;
import lp3.grupal.BugHunter2.Repositorio.MarcaRepository;
import lp3.grupal.BugHunter2.Repositorio.ProductoRepository;
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
    private ProductoRepository productoRepository;
    
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
    
    @GetMapping("/editar/{m_id}")
    public String editar(Model model, Marca marca){
        marca=marca_repo.findById(marca.getM_id()).orElse(null);
        model.addAttribute("marcas", marca);
        model.addAttribute("vista", "marcas/formAgg");
        model.addAttribute("fragmento", "marcasformAgg");
        return "index";
    }
    
    @GetMapping("/borrar/{m_id}")
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

    public MarcaController(MarcaRepository marca_repo, ProductoRepository productoRepository) {
        this.marca_repo = marca_repo;
        this.productoRepository = productoRepository;
    }
    
    @GetMapping("/{m_id}/productos")
    public String listaProductosPorMarca(Model model, Marca marca){
        marca=marca_repo.findById(marca.getM_id()).orElse(null);
        if (marca != null) {
            List<Producto> productos = productoRepository.findAllByMarca(marca);
            model.addAttribute("productos", productos);
        }
        model.addAttribute("vista", "admin/productos_s_marca");
        model.addAttribute("fragmento", "productoLista");
        return "index";
    }
}
