package co.edu.uniquindio.Hotel.parcial1.model.builder;

import co.edu.uniquindio.Hotel.parcial1.model.Servicio;
import co.edu.uniquindio.Hotel.parcial1.model.ServicioHabitacion;

public class ServicioHabitacionBuilder extends ServicioBuilder<ServicioHabitacionBuilder> {

    @Override
    public ServicioHabitacion build() {
        return new ServicioHabitacion(nombre, precio, null, null);
    }

    @Override
    protected ServicioHabitacionBuilder self() {
        return this;
    }
}
