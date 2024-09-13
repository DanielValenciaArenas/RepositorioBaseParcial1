package co.edu.uniquindio.Hotel.parcial1.model.builder;

import co.edu.uniquindio.Hotel.parcial1.model.Cliente;
import co.edu.uniquindio.Hotel.parcial1.model.Reserva;
import co.edu.uniquindio.Hotel.parcial1.model.Servicio;

import java.util.Collection;

public class ClienteBuilder {

    protected String nombre;
    protected String dni;

    public Cliente build(){
        return new Cliente(nombre, dni, null, null);
    }

    public ClienteBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ClienteBuilder dni(String dni){
        this.dni = dni;
        return this;
    }

}
