package co.edu.uniquindio.Hotel.parcial1.model.builder;

import co.edu.uniquindio.Hotel.parcial1.model.ServicioLimpieza;
import co.edu.uniquindio.Hotel.parcial1.model.ServicioRestaurante;

public class ServicioRestauranteBuilder extends ServicioBuilder<ServicioRestauranteBuilder> {

    @Override
    public ServicioRestaurante build() {
        return new ServicioRestaurante(nombre, precio, null, null);
    }

    @Override
    protected ServicioRestauranteBuilder self() {
        return this;
    }

}
