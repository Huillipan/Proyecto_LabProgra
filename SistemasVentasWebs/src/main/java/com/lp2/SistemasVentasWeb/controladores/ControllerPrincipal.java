
package com.lp2.SistemasVentasWeb.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ControllerPrincipal {
    
  
    
   @GetMapping("/principal")
    public String mostrarInicio(Model model) {
        
        return "Principal"; 
    }
   
//__________________________________________________________________________________________________________________
      @GetMapping("/ventas")
    public String mostrarVentas(Model model) {
       
        return "Ventas"; 
    }
    
    
}
