package co.edu.uniquindio.Hotel.parcial1.model.builder;

import co.edu.uniquindio.Hotel.parcial1.model.Reserva;

import java.time.LocalDate;

public class ReservaBuilder {

    protected LocalDate fechaEntrada;
    protected LocalDate fechaSalida;

    public Reserva build() {
        return new Reserva(fechaEntrada, fechaSalida, null, null);
    }

    public ReservaBuilder fechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
        return this;
    }

    public ReservaBuilder fechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

}
