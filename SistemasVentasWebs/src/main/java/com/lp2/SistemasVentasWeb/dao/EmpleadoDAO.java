
package com.lp2.SistemasVentasWeb.dao;

import com.lp2.SistemasVentasWeb.modelo.Empleado;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface EmpleadoDAO extends CrudRepository<Empleado, Integer> {
    
    @Override
    public List<Empleado>findAll();
    public Empleado findByIdEmpleado(int id);
    
}
 