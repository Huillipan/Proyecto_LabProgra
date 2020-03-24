package com.lp2.SistemasVentasWeb.modelo;

import com.lp2.SistemasVentasWeb.modelo.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-24T17:06:21")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> estado;
    public static volatile SingularAttribute<Producto, Integer> precio;
    public static volatile ListAttribute<Producto, Ventas> ventasList;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, Integer> stock;
    public static volatile SingularAttribute<Producto, String> nombres;

}