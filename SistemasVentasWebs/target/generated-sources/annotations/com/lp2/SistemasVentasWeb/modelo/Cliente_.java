package com.lp2.SistemasVentasWeb.modelo;

import com.lp2.SistemasVentasWeb.modelo.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-24T17:06:21")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> estado;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile ListAttribute<Cliente, Ventas> ventasList;
    public static volatile SingularAttribute<Cliente, Integer> dni;
    public static volatile SingularAttribute<Cliente, String> nombres;

}