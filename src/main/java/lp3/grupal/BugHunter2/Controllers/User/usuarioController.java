package lp3.grupal.BugHunter2.Controllers.User;

import lp3.grupal.BugHunter2.Models.Producto;
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
@RequestMapping(value="/user")
public class usuarioController {
    
    public String index(Model model){
        return "index";
    }
    
    @Autowired 
    private ProductoRepository producto_repo;
    
    @RequestMapping(value="/")
    public String menu(Model model){
        var producto = producto_repo.findAll();
        model.addAttribute("producto", producto);
        model.addAttribute("vista", "user/inicioUser");
        model.addAttribute("estilo", "user/inicioUser");
        model.addAttribute("parte", "style");
        model.addAttribute("fragmento", "productoscards");
        return "indexUs";
    }
    
    @GetMapping("/producto/{p_id}")
    public String detalles(Model model, Producto producto){
        producto=producto_repo.findById(producto.getP_id()).orElse(null);
        model.addAttribute("producto",producto);
        model.addAttribute("vista", "user/productoDetail");
        model.addAttribute("estilo", "user/productoDetail");
        model.addAttribute("parte", "style");
        model.addAttribute("fragmento", "productosdetalles");
        return "indexUs";
    }
    
    @GetMapping("/nuevo")
    public String nuevo(Model model, Producto producto){
        model.addAttribute("estilo", "user/productoDetail");
        model.addAttribute("parte", "style");
        model.addAttribute("vista", "user/productoForm");
        model.addAttribute("fragmento", "productoform");
        return "indexUs";
    }
    
    @GetMapping("/producto/editar/{p_id}")
    public String editarProducto(Model model, Producto producto){
        producto=producto_repo.findById(producto.getP_id()).orElse(null);
        model.addAttribute("producto",producto);
        model.addAttribute("estilo", "user/productoDetail");
        model.addAttribute("parte", "style");
        model.addAttribute("vista", "user/productoForm");
        model.addAttribute("fragmento", "productoform");
        return "indexUs";
    }
    
    @PostMapping("/guardar")
    public String guardar(Producto producto)
    {  
        producto_repo.save(producto);
        return "redirect:/user/";
    }
    
    
    @GetMapping("/borrar/{p_id}")
    public String borrar(Producto producto){
        producto_repo.delete(producto);
        return "redirect:/user/";
    }
    
    
    
    
}
