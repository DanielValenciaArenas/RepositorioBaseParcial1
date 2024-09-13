package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.model.builder.ClienteBuilder;
import co.edu.uniquindio.Hotel.parcial1.model.builder.ServicioHabitacionBuilder;
import co.edu.uniquindio.Hotel.parcial1.model.builder.ServicioLimpiezaBuilder;

public class ServicioLimpieza extends Servicio {

    public ServicioLimpieza(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        super(nombre, precio, habitacionAsociada, clienteAsociado);
    }

    /*
     * Metodo builder
     */

    public static ServicioLimpiezaBuilder builder(){
        return new ServicioLimpiezaBuilder();
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de Limpieza consumido: " + getNombre());
    }

    @Override
    public String toString() {
        return "ServicioLimpieza{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", habitacionAsociada=" + (getHabitacionAsociada() != null ? getHabitacionAsociada().toString() : "Ninguna") +
                ", clienteAsociado=" + (getClienteAsociado() != null ? getClienteAsociado().toString() : "Ninguno") +
                '}';
    }

}
