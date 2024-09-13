package co.edu.uniquindio.Hotel.parcial1.model.builder;

import co.edu.uniquindio.Hotel.parcial1.model.Habitacion;
import co.edu.uniquindio.Hotel.parcial1.model.TipoHabitacion;

public class HabitacionBuilder {

    protected int numero;
    protected TipoHabitacion tipoHabitacion;
    protected double precio;

    public Habitacion build() {
        return new Habitacion(numero, tipoHabitacion, precio, null, null);
    }

    public HabitacionBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }

    public HabitacionBuilder tipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        return this;
    }

    public HabitacionBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

}
