package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.model.builder.ClienteBuilder;
import co.edu.uniquindio.Hotel.parcial1.model.builder.HabitacionBuilder;

import java.util.ArrayList;
import java.util.Collection;

public class Habitacion {
    private int numero;
    private TipoHabitacion tipoHabitacion;
    private double precio;
    private Reserva reservaAsociada;
    private Collection<Servicio> listaServiciosAsociados;

    /*
     * Metodo constructor de la clase Habitcion
     */
    public Habitacion(int numero, TipoHabitacion tipoHabitacion, double precio, Reserva reservaAsociada, Collection<Servicio> listaServiciosAsociados) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.reservaAsociada = reservaAsociada;
        this.listaServiciosAsociados = (listaServiciosAsociados != null) ? listaServiciosAsociados : new ArrayList<>();
    }

    /*
     * Metodo builder
     */

    public static HabitacionBuilder builder(){
        return new HabitacionBuilder();
    }

    /*
     * Getters y Setters
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Reserva getReservaAsociada() {
        return reservaAsociada;
    }

    public void setReservaAsociada(Reserva reservaAsociada) {
        this.reservaAsociada = reservaAsociada;
    }

    public Collection<Servicio> getListaServiciosAsociados() {
        return listaServiciosAsociados;
    }

    public void setListaServiciosAsociados(Collection<Servicio> listaServiciosAsociados) {
        this.listaServiciosAsociados = listaServiciosAsociados;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", tipoHabitacion=" + tipoHabitacion +
                ", precio=" + precio +
                ", reservaAsociada=" + (reservaAsociada != null ? reservaAsociada : "Ninguna") +
                '}';
    }


}