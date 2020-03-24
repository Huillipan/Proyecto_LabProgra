
package com.lp2.SistemasVentasWeb.dao;

import com.lp2.SistemasVentasWeb.modelo.Ventas;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface VentasDAO extends CrudRepository<Ventas, Integer> {
    public List<Ventas> findAll();
}
