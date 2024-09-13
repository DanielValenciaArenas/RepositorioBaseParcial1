package co.edu.uniquindio.Hotel.parcial1.services;

import co.edu.uniquindio.Hotel.parcial1.model.Reserva;
import co.edu.uniquindio.Hotel.parcial1.model.Servicio;
import co.edu.uniquindio.Hotel.parcial1.model.Cliente;

import java.util.Collection;

public interface ICrudCliente {

    boolean crearCliente(String nombre, String dni, Collection<Reserva> reservasAsociadas, Collection<Servicio> serviciosAsociados);
    Cliente getCliente(String dni);
    boolean modificarCliente(String nombre, String dni, Collection<Reserva> reservasAsociadas, Collection<Servicio> serviciosAsociados);
    boolean eliminarCliente(String dni);
    Collection<Cliente> getClientes();


}
