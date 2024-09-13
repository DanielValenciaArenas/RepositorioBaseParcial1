package co.edu.uniquindio.Hotel.parcial1.services;

import co.edu.uniquindio.Hotel.parcial1.model.*;

import java.util.Collection;

public interface ICrudServicioLimpieza {

    boolean crearServicioLimpieza(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado);
    ServicioLimpieza getServicioLimpieza(String nombre);
    boolean modificarServicioLimpieza(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado);
    boolean eliminarServicioLimpieza(String nombre);
    Collection<ServicioLimpieza> getServiciosLimpieza();


}
