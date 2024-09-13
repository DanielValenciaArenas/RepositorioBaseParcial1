package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.services.IConsumible;

public abstract class Servicio implements IConsumible {

    private String nombre;
    private double precio;
    private Habitacion habitacionAsociada;
    private Cliente clienteAsociado;

    /*
     * Metodo Constructor de la clase Servicio
     */
    public Servicio(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        this.nombre = nombre;
        this.precio = precio;
        this.habitacionAsociada = habitacionAsociada;
        this.clienteAsociado = clienteAsociado;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Habitacion getHabitacionAsociada() {
        return habitacionAsociada;
    }

    public void setHabitacionAsociada(Habitacion habitacionAsociada) {
        this.habitacionAsociada = habitacionAsociada;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    /*
     * Implementacion del metodo consumir de la interfaz Consumible
     */
    @Override
    public abstract void consumir();

}
