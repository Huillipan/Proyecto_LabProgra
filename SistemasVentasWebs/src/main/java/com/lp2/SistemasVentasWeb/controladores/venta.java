
package com.lp2.SistemasVentasWeb.controladores;

import com.lp2.SistemasVentasWeb.dao.ClienteDAO;
import com.lp2.SistemasVentasWeb.dao.EmpleadoDAO;
import com.lp2.SistemasVentasWeb.dao.ProductoDAO;
import com.lp2.SistemasVentasWeb.dao.VentasDAO;
import com.lp2.SistemasVentasWeb.modelo.Ventas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class venta {
    @Autowired
    ClienteDAO cDAO;
    @Autowired
    ProductoDAO pDAO;
    @Autowired
    EmpleadoDAO eDAO;
     @Autowired
    VentasDAO vDAO;

    
       @GetMapping("/venta")
    public String mostrarVenta(Model model) {

        List<Ventas> VentasBD = vDAO.findAll();
        
        model.addAttribute("venta", new Ventas());
        model.addAttribute("ListaVenta", VentasBD);
        return "Ventas"; 
    }
    
      @PostMapping("/venta")
    public String agregarVenta(@ModelAttribute Ventas vr){
         
        vDAO.save(vr);
        return"redirect:/venta";
    }


  
    
}
