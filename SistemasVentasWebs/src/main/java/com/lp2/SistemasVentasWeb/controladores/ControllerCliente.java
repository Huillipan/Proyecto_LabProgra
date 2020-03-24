
package com.lp2.SistemasVentasWeb.controladores;

import com.lp2.SistemasVentasWeb.dao.ClienteDAO;
import com.lp2.SistemasVentasWeb.modelo.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ControllerCliente {
    
@Autowired
    ClienteDAO cDAO;


   // ____________________________Agregar_________________________________
              @GetMapping("/clientes")
    public String mostrarClientes(Model model) {

        List<Cliente> ClienteBD = cDAO.findAll();
        
         model.addAttribute("cliente", new Cliente());
        model.addAttribute("ListaCliente", ClienteBD);
        return "Clientes"; 
    }
    
      @PostMapping("/clientes")
    public String agregarClientes(@ModelAttribute Cliente cr){
         
        cDAO.save(cr);
        return"redirect:/clientes";
    }
     
    
   // ____________________________Eliminar_________________________________
     @PostMapping("/clientes/{idCliente}")
    public String eliminarClientes(@ModelAttribute Cliente cr){
    
      cDAO.delete(cr);
        return"redirect:/clientes";
    }
    
    
   // ____________________________Editar_________________________________
    
       @GetMapping("/cliente/{idCliente}/editar")
    
    public String CargarCliente(Model model, @PathVariable(name="idCliente") Integer id){
        
      Cliente c = cDAO.findByIdCliente(id);
       model.addAttribute("Cliente", c);
       
       return"EditarClientes";
    }
    
    @PostMapping("/cliente/{idCliente}/editar")
   public String editarCliente(@ModelAttribute Cliente cr){
      
       
       cDAO.save(cr);
       
   return "redirect:/clientes";
   }
}
