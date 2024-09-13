package co.edu.uniquindio.Hotel.parcial1.services;

import co.edu.uniquindio.Hotel.parcial1.model.*;

import java.util.Collection;

public interface ICrudServicioHabitacion {

    boolean crearServicioHabitacion(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado);
    ServicioHabitacion getServicioHabitacion(String nombre);
    boolean modificarServicioHabitacion(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado);
    boolean eliminarServicioHabitacion(String nombre);
    Collection<ServicioHabitacion> getServiciosHabitacion();

}
