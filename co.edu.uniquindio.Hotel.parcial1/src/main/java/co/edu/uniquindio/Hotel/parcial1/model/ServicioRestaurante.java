package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.model.builder.ClienteBuilder;
import co.edu.uniquindio.Hotel.parcial1.model.builder.ServicioRestauranteBuilder;

public class ServicioRestaurante extends Servicio {

    public ServicioRestaurante(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        super(nombre, precio, habitacionAsociada, clienteAsociado);
    }

    /*
     * Metodo builder
     */

    public static ServicioRestauranteBuilder builder(){
        return new ServicioRestauranteBuilder();
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de Restaurante consumido: " + getNombre());
    }

    @Override
    public String toString() {
        return "ServicioRestaurante{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", habitacionAsociada=" + (getHabitacionAsociada() != null ? getHabitacionAsociada().toString() : "Ninguna") +
                ", clienteAsociado=" + (getClienteAsociado() != null ? getClienteAsociado().toString() : "Ninguno") +
                '}';
    }

}
