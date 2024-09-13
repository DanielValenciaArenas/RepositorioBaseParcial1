package co.edu.uniquindio.Hotel.parcial1.model.builder;

import co.edu.uniquindio.Hotel.parcial1.model.Servicio;

public abstract class ServicioBuilder<T extends ServicioBuilder<T>> {

    protected String nombre;
    protected double precio;

    public T nombre(String nombre){
        this.nombre = nombre;
        return self();
    }

    public T precio(double precio){
        this.precio = precio;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public abstract Servicio build();


}
