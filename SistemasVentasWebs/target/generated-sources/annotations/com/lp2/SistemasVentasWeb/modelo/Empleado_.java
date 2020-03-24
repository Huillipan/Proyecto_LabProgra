package com.lp2.SistemasVentasWeb.modelo;

import com.lp2.SistemasVentasWeb.modelo.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-24T17:06:21")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> estado;
    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile ListAttribute<Empleado, Ventas> ventasList;
    public static volatile SingularAttribute<Empleado, Integer> telefono;
    public static volatile SingularAttribute<Empleado, String> user;
    public static volatile SingularAttribute<Empleado, Integer> dni;
    public static volatile SingularAttribute<Empleado, String> nombres;

}