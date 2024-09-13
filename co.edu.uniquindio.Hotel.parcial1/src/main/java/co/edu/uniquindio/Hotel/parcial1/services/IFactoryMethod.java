package co.edu.uniquindio.Hotel.parcial1.services;

public interface IFactoryMethod<T> {
    T create();

    //* IMPLEMENTACION (EJEMPLO en SERVICIO)
    // public Servicio create(TipoServicio tipo, String nombre, double precio) {
    //        switch (tipo) {
    //            case HABITACION:
    //                return new ServicioHabitacion(nombre, precio, null, null);
    //            case LIMPIEZA:
    //                return new ServicioLimpieza(nombre, precio, null, null);
    //            case RESTAURANTE:
    //                return new ServicioRestaurante(nombre, precio, null, null);
    //            case SPA:
    //                return new ServicioSpa(nombre, precio, null, null);
    //            default:
    //                throw new IllegalArgumentException("El servicio no existe");
    //        }
    // ES UNA CLASE, NO UNA INTERFAZ
    //
    // *
}
