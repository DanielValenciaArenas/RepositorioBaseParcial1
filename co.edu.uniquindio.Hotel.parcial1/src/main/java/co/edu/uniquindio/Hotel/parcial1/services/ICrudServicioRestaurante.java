package co.edu.uniquindio.Hotel.parcial1.services;

import co.edu.uniquindio.Hotel.parcial1.model.*;

import java.util.Collection;

public interface ICrudServicioRestaurante {

    boolean crearServicioRestaurante(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado);
    ServicioRestaurante getServicioRestaurante(String nombre);
    boolean modificarServicioRestaurante(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado);
    boolean eliminarServicioRestaurante(String nombre);
    Collection<ServicioRestaurante> getServiciosRestaurante();

}
