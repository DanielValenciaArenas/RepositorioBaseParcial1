package co.edu.uniquindio.Hotel.parcial1.model.builder;

import co.edu.uniquindio.Hotel.parcial1.model.ServicioLimpieza;
import co.edu.uniquindio.Hotel.parcial1.model.ServicioSpa;

public class ServicioSpaBuilder extends ServicioBuilder<ServicioSpaBuilder> {

    @Override
    public ServicioSpa build() {
        return new ServicioSpa(nombre, precio, null, null);
    }

    @Override
    protected ServicioSpaBuilder self() {
        return this;
    }

}
