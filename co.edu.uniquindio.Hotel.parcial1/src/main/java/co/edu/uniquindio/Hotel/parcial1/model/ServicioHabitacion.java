package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.model.builder.ClienteBuilder;
import co.edu.uniquindio.Hotel.parcial1.model.builder.ServicioHabitacionBuilder;

public class ServicioHabitacion extends Servicio {

    public ServicioHabitacion(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        super(nombre, precio, habitacionAsociada, clienteAsociado);
    }

    /*
     * Metodo builder
     */

    public static ServicioHabitacionBuilder builder(){
        return new ServicioHabitacionBuilder();
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de Habitación consumido: " + getNombre());
    }


    @Override
    public String toString() {
        return "ServicioHabitacion{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", habitacionAsociada=" + (getHabitacionAsociada() != null ? getHabitacionAsociada().toString() : "Ninguna") +
                ", clienteAsociado=" + (getClienteAsociado() != null ? getClienteAsociado().toString() : "Ninguno") +
                '}';
    }

}
