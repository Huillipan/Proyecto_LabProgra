
package com.lp2.SistemasVentasWeb.dao;

import com.lp2.SistemasVentasWeb.modelo.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
    public List<Cliente> findAll();
     public Cliente findByIdCliente(int id);
     
     public Cliente findByDni(int dni); 
}
