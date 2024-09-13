package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.model.builder.ClienteBuilder;
import co.edu.uniquindio.Hotel.parcial1.model.builder.ServicioSpaBuilder;

public class ServicioSpa extends Servicio {

    public ServicioSpa(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        super(nombre, precio, habitacionAsociada, clienteAsociado);
    }

    /*
     * Metodo builder
     */

    public static ServicioSpaBuilder builder(){
        return new ServicioSpaBuilder();
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de Spa consumido: " + getNombre());
    }

    @Override
    public String toString() {
        return "ServicioSpa{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", habitacionAsociada=" + (getHabitacionAsociada() != null ? getHabitacionAsociada().toString() : "Ninguna") +
                ", clienteAsociado=" + (getClienteAsociado() != null ? getClienteAsociado().toString() : "Ninguno") +
                '}';
    }


}
