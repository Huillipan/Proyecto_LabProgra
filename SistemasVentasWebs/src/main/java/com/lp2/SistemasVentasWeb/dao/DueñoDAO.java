
package com.lp2.SistemasVentasWeb.dao;

import com.lp2.SistemasVentasWeb.modelo.Dueño;
import org.springframework.data.repository.CrudRepository;
import java.util.List;



public interface DueñoDAO extends CrudRepository<Dueño, Integer> {
    
       @Override
    public List<Dueño> findAll();
    
    public Dueño findByUsuarioAndContraseña(String user, String pass);
}
