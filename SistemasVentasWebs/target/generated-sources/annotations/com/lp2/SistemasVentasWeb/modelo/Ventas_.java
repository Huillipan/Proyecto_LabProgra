package com.lp2.SistemasVentasWeb.modelo;

import com.lp2.SistemasVentasWeb.modelo.Cliente;
import com.lp2.SistemasVentasWeb.modelo.Empleado;
import com.lp2.SistemasVentasWeb.modelo.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-24T17:06:21")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Producto> productoidProducto;
    public static volatile SingularAttribute<Ventas, Cliente> clienteidCliente;
    public static volatile SingularAttribute<Ventas, Empleado> empleadoidEmpleado;
    public static volatile SingularAttribute<Ventas, Integer> idVentas;

}