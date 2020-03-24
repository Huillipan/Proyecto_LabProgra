
package com.lp2.SistemasVentasWeb.dao;

import com.lp2.SistemasVentasWeb.modelo.Producto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ProductoDAO extends CrudRepository<Producto, Integer> {
    
   public List<Producto> findAll();
   public Producto findByIdProducto(int id);
   
}
