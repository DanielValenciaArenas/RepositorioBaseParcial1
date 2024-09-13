package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.model.builder.ClienteBuilder;
import co.edu.uniquindio.Hotel.parcial1.model.builder.ReservaBuilder;

import java.time.LocalDate;
import java.util.Collection;

public class Reserva {
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Cliente clienteAsociado;
    private Habitacion habitacionAsociada;

    /*
     * Metodo Constructor de la clase Reserva
     */
    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente clienteAsociado, Habitacion habitacionAsociada) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.clienteAsociado = clienteAsociado;
        this.habitacionAsociada = habitacionAsociada;
    }

    /*
     * Metodo builder
     */

    public static ReservaBuilder builder(){
        return new ReservaBuilder();
    }

    /*
     * Getters y Setters
     */

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida = fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    public void setHabitacionAsociada(Habitacion habitacionAsociada) {
        this.habitacionAsociada = habitacionAsociada;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", clienteAsociado=" + (clienteAsociado != null ? clienteAsociado.toString() : "Ninguno") +
                ", habitacionAsociada=" + (habitacionAsociada != null ? habitacionAsociada.toString() : "Ninguna")+
                '}';
    }

}
