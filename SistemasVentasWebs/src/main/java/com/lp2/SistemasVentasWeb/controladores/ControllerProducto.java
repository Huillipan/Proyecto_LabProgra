package com.lp2.SistemasVentasWeb.controladores;

import com.lp2.SistemasVentasWeb.dao.ProductoDAO;

import com.lp2.SistemasVentasWeb.modelo.Producto;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerProducto {

    @Autowired
    ProductoDAO pDAO;
   // ____________________________Agregar_________________________________
    @GetMapping("/productos")
    public String mostrarProductos(Model model) {

        List<Producto> productosBD = pDAO.findAll();

        model.addAttribute("producto", new Producto());
        model.addAttribute("ListaProductos", productosBD);
        return "Productos";

    }

    @PostMapping("/productos")
    public String agregarProductos(@ModelAttribute Producto p) {

        pDAO.save(p);
        return "redirect:/productos";
    }
       // ____________________________Eliminar_________________________________
    @PostMapping("/productos/{idProducto}")
    public String eliminarProductos(@ModelAttribute Producto pr){
    
      pDAO.delete(pr);
        return"redirect:/productos";
    }
       // ____________________________Editar_________________________________
    
    
        @GetMapping("/producto/{idProducto}/editar")
    
    public String CargarCliente(Model model, @PathVariable(name="idProducto") Integer id){
        
      Producto p = pDAO.findByIdProducto(id);
       model.addAttribute("Producto", p);
       
       return"EditarProducto";
    }
    
    @PostMapping("/producto/{idProducto}/editar")
   public String editarCliente(@ModelAttribute Producto pr){
      
       
       pDAO.save(pr);
       
   return "redirect:/productos";
   }
}
