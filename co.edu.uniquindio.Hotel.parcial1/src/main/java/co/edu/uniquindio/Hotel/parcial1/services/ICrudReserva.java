package co.edu.uniquindio.Hotel.parcial1.services;

import co.edu.uniquindio.Hotel.parcial1.model.Cliente;
import co.edu.uniquindio.Hotel.parcial1.model.Habitacion;
import co.edu.uniquindio.Hotel.parcial1.model.Reserva;

import java.time.LocalDate;
import java.util.Collection;

public interface ICrudReserva {

    boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente clienteAsociado, Habitacion habitacionAsociada);
    Reserva getReserva(LocalDate fechaEntrada, Cliente clienteAsociado);
    boolean modificarReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente clienteAsociado, Habitacion habitacionAsociada);
    boolean eliminarReserva(LocalDate fechaEntrada, Cliente clienteAsociado);
    Collection<Reserva> getReservas();
}
