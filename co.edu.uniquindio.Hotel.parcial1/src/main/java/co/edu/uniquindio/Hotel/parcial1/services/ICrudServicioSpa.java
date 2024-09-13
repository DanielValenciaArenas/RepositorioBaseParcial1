package co.edu.uniquindio.Hotel.parcial1.services;

import co.edu.uniquindio.Hotel.parcial1.model.*;

import java.util.Collection;

public interface ICrudServicioSpa {

    boolean crearServicioSpa(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado);
    ServicioSpa getServicioSpa(String nombre);
    boolean modificarServicioSpa(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado);
    boolean eliminarServicioSpa(String nombre);
    Collection<ServicioSpa> getServiciosSpa();

}
