package co.edu.uniquindio.Hotel.parcial1.services;

import co.edu.uniquindio.Hotel.parcial1.model.*;

import java.util.Collection;

public interface ICrudHabitacion {

    boolean crearHabitacion(int numero, TipoHabitacion tipoHabitacion, double precio, Reserva reservaAsociada, Collection<Servicio> listaServicios);
    Habitacion getHabitacion(int numero);
    boolean modificarHabitacion(int numero, TipoHabitacion tipoHabitacion, double precio, Reserva reservaAsociada, Collection<Servicio> listaServicios);
    boolean eliminarHabitacion(int numero);
    Collection<Habitacion> getHabitaciones();

}
