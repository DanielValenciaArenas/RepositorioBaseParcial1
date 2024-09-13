package co.edu.uniquindio.Hotel.parcial1.model.builder;

import co.edu.uniquindio.Hotel.parcial1.model.ServicioHabitacion;
import co.edu.uniquindio.Hotel.parcial1.model.ServicioLimpieza;

public class ServicioLimpiezaBuilder extends ServicioBuilder<ServicioLimpiezaBuilder> {

    @Override
    public ServicioLimpieza build() {
        return new ServicioLimpieza(nombre, precio, null, null);
    }

    @Override
    protected ServicioLimpiezaBuilder self() {
        return this;
    }

}
