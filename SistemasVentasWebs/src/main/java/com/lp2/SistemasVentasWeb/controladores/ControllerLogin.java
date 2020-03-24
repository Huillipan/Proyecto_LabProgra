package com.lp2.SistemasVentasWeb.controladores;

import com.lp2.SistemasVentasWeb.dao.DueñoDAO;
import com.lp2.SistemasVentasWeb.modelo.Dueño;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerLogin {

    @Autowired
    DueñoDAO dDAO;

    @GetMapping("/login")
    public String mostrarLogin(Model model) {
        model.addAttribute("duenio", new Dueño());
        return "Login"; // el nombre del template html
    }

    @PostMapping("/login")

    public String logueo(Model model, @ModelAttribute Dueño q, HttpServletRequest request) {
        Dueño DueñoBD = dDAO.findByUsuarioAndContraseña(q.getUsuario(), q.getContraseña());

        if (DueñoBD != null) {
            request.getSession().setAttribute("usuarioLogeado", DueñoBD);
            return "Principal";
        } else {
            model.addAttribute("duenio", new Dueño());
            model.addAttribute("error", true);
            return "Login";
        }

    }

}
