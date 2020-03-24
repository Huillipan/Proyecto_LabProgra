package com.lp2.SistemasVentasWeb.controladores;

import com.lp2.SistemasVentasWeb.dao.EmpleadoDAO;
import com.lp2.SistemasVentasWeb.modelo.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerEmpleados {

    @Autowired
    EmpleadoDAO eDAO;

    // ____________________________Agregar_________________________________
    @GetMapping("/empleados")
    public String mostrarEmpleados(Model model) {
        List<Empleado> EmpleadoBD = eDAO.findAll();

        model.addAttribute("empleado", new Empleado());

       
        model.addAttribute("ListaEmpleado", EmpleadoBD);

        return "Empleados";
    }

    @PostMapping("/empleados")
    public String agregarEmpleados(@ModelAttribute Empleado er) {

        eDAO.save(er);
        return "redirect:/empleados";
    }

   // ____________________________Eliminar_________________________________
 @PostMapping("/empleados/{idEmpleado}/eliminar")
    public String eliminarEmpleados(@ModelAttribute Empleado er) {

        eDAO.delete(er);
        return "redirect:/empleados";
    }
    
    
    
    // ____________________________Editar_________________________________
    @GetMapping("/empleados/{idEmpleado}/editar")
    
    public String CargarEmpleado(Model model, @PathVariable(name="idEmpleado") Integer id){
        
       Empleado e = eDAO.findByIdEmpleado(id);
       model.addAttribute("Empleado", e);
       
       return"EditarEmpleados";
    }
    
    @PostMapping("/empleados/{idEmpleado}/editar")
   public String editarEmpleado(@ModelAttribute Empleado er){
      
       
       eDAO.save(er);
       
   return "redirect:/empleados";
   }

}