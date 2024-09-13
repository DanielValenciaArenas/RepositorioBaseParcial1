package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.model.builder.ClienteBuilder;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {

    private String nombre;
    private String dni;
    private Collection<Reserva> reservasAsociadas;
    private Collection<Servicio> serviciosAsociados;

    /*
     * Metodo Constructor de la clase Cliente
     */

    public Cliente(String nombre, String dni, Collection<Reserva> reservasAsociadas, Collection<Servicio> serviciosAsociados) {
        this.nombre = nombre;
        this.dni = dni;
        this.reservasAsociadas = (reservasAsociadas != null) ? reservasAsociadas : new ArrayList<>();
        this.serviciosAsociados = (serviciosAsociados != null) ? serviciosAsociados : new ArrayList<>();
    }

    /*
     * Metodo builder
     */

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    /*
     * Getters y Setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Collection<Reserva> getReservasAsociadas() {
        return reservasAsociadas;
    }

    public void setReservasAsociadas(Collection<Reserva> reservasAsociadas) {
        this.reservasAsociadas = reservasAsociadas;
    }

    public Collection<Servicio> getServiciosAsociados() {
        return serviciosAsociados;
    }

    public void setServiciosAsociados(Collection<Servicio> serviciosAsociados) {
        this.serviciosAsociados = serviciosAsociados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

}