package com.lp2.SistemasVentasWeb.modelo;

import com.lp2.SistemasVentasWeb.modelo.DetalleVentasPK;
import com.lp2.SistemasVentasWeb.modelo.Producto;
import com.lp2.SistemasVentasWeb.modelo.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-19T20:32:31")
@StaticMetamodel(DetalleVentas.class)
public class DetalleVentas_ { 

    public static volatile SingularAttribute<DetalleVentas, DetalleVentasPK> detalleVentasPK;
    public static volatile SingularAttribute<DetalleVentas, Ventas> ventas;
    public static volatile SingularAttribute<DetalleVentas, Integer> cantidad;
    public static volatile SingularAttribute<DetalleVentas, Producto> producto;
    public static volatile SingularAttribute<DetalleVentas, Double> precioVenta;

}