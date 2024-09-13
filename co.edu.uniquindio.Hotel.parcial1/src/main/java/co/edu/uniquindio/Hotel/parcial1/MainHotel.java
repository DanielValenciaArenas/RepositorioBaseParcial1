package co.edu.uniquindio.Hotel.parcial1;

import co.edu.uniquindio.Hotel.parcial1.factory.ModelFactory;
import co.edu.uniquindio.Hotel.parcial1.model.*;

import java.time.LocalDate;

//*
// Metodo Principal que inicia la aplicacion. Crea el Hotel y muestra el Menú principal
// *
public class MainHotel {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();

        crudCliente(modelFactory);
        crudHabitacion(modelFactory);
        crudReserva(modelFactory);
        crudServicioHabitacion(modelFactory);
        crudServicioLimpieza(modelFactory);
        crudServicioRestaurante(modelFactory);
        crudServicioSpa(modelFactory);


    }

    //Funcionamiento de los CRUD

    public static void crudCliente(ModelFactory modelFactory) {
        crearCliente(modelFactory);
        leerCliente(modelFactory);
        eliminarCliente(modelFactory);
        modificarCliente(modelFactory);
    }

    private static void eliminarCliente(ModelFactory modelFactory){
        boolean eliminado = modelFactory.eliminarCliente("1452129951");
        System.out.println("El proceso de eliminacion del Cliente finalizó con un estado de: " + eliminado);
    }

    public static void  crearCliente(ModelFactory modelFactory){
        boolean creado = modelFactory.crearCliente("Arturo", "11233345", null, null);
        System.out.println("El proces de cracion del Cliente finalizó con un estado de: " + creado);
    }

    public static void modificarCliente(ModelFactory modelFactory){
        boolean modificado = modelFactory.modificarCliente("Monica", "1126543278", null, null);
        System.out.println("El proceso de modificacion del Cliente finalizó con un estado de: " + modificado);

    }

    public static void leerCliente(ModelFactory modelFactory){
        Cliente leido = modelFactory.getCliente("1452129951");
        System.out.println("El cliente leido es: " + leido);
    }

    public static void crudHabitacion(ModelFactory modelFactory) {
        crearHabitacion(modelFactory);
        leerHabitacion(modelFactory);
        eliminarHabitacion(modelFactory);
        modificarHabitacion(modelFactory);
    }

    public static void crearHabitacion(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearHabitacion(320, TipoHabitacion.DOBLE, 150.0, null, null);
        System.out.println("El proceso de creación de la Habitación finalizó con un estado de: " + creado);
    }

    public static void leerHabitacion(ModelFactory modelFactory) {
        Habitacion leida = modelFactory.getHabitacion(101);
        System.out.println("La habitación leída es: " + leida);
    }

    private static void eliminarHabitacion(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarHabitacion(101);
        System.out.println("El proceso de eliminación de la Habitación finalizó con un estado de: " + eliminado);
    }

    public static void modificarHabitacion(ModelFactory modelFactory) {
        boolean modificado = modelFactory.modificarHabitacion(205, TipoHabitacion.SIMPLE, 120.0, null, null);
        System.out.println("El proceso de modificación de la Habitación finalizó con un estado de: " + modificado);
    }

    public static void crudReserva(ModelFactory modelFactory) {
        crearReserva(modelFactory);
        leerReserva(modelFactory);
        eliminarReserva(modelFactory);
        modificarReserva(modelFactory);
    }

    public static void crearReserva(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearReserva(LocalDate.now(), LocalDate.now().plusDays(3), null, null);
        System.out.println("El proceso de creación de la Reserva finalizó con un estado de: " + creado);
    }

    public static void leerReserva(ModelFactory modelFactory) {
        Reserva leida = modelFactory.getReserva(LocalDate.of(2024, 2, 16), modelFactory.getCliente("1098234154"));
        System.out.println("La reserva leída es: " + leida);
    }

    private static void eliminarReserva(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarReserva(LocalDate.of(2024, 2, 16), modelFactory.getCliente("1098234154"));
        System.out.println("El proceso de eliminación de la Reserva finalizó con un estado de: " + eliminado);
    }

    public static void modificarReserva(ModelFactory modelFactory) {
        boolean modificado = modelFactory.modificarReserva(LocalDate.of(2024, 1, 22), LocalDate.of(2024, 7, 19), modelFactory.getCliente("1010023192"), null);
        System.out.println("El proceso de modificación de la Reserva finalizó con un estado de: " + modificado);
    }

    public static void crudServicioHabitacion(ModelFactory modelFactory) {
        crearServicioHabitacion(modelFactory);
        leerServicioHabitacion(modelFactory);
        eliminarServicioHabitacion(modelFactory);
        modificarServicioHabitacion(modelFactory);
    }

    public static void crearServicioHabitacion(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearServicioHabitacion("Servicio matutino", 50.0, null, null);
        System.out.println("El proceso de creación del Servicio de Habitación finalizó con un estado de: " + creado);
    }

    public static void leerServicioHabitacion(ModelFactory modelFactory) {
        Servicio leido = modelFactory.getServicioHabitacion("Llaves de repuesto");
        System.out.println("El servicio de habitación leído es: " + leido);
    }

    private static void eliminarServicioHabitacion(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarServicioHabitacion("Sabanas");
        System.out.println("El proceso de eliminación del Servicio de Habitación finalizó con un estado de: " + eliminado);
    }

    public static void modificarServicioHabitacion(ModelFactory modelFactory) {
        boolean modificado = modelFactory.modificarServicioHabitacion("Cobijas", 900.0, modelFactory.getHabitacion(101), null);
        System.out.println("El proceso de modificación del Servicio de Habitación finalizó con un estado de: " + modificado);
    }


    public static void crudServicioLimpieza(ModelFactory modelFactory) {
        crearServicioLimpieza(modelFactory);
        leerServicioLimpieza(modelFactory);
        eliminarServicioLimpieza(modelFactory);
        modificarServicioLimpieza(modelFactory);
    }

    public static void crearServicioLimpieza(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearServicioLimpieza("Limpieza diaria", 30.0, null, null);
        System.out.println("El proceso de creación del Servicio de Limpieza finalizó con un estado de: " + creado);
    }

    public static void leerServicioLimpieza(ModelFactory modelFactory) {
        Servicio leido = modelFactory.getServicioLimpieza("Trapeado");
        System.out.println("El servicio de limpieza leído es: " + leido);
    }

    private static void eliminarServicioLimpieza(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarServicioLimpieza("Trapeado");
        System.out.println("El proceso de eliminación del Servicio de Limpieza finalizó con un estado de: " + eliminado);
    }

    public static void modificarServicioLimpieza(ModelFactory modelFactory) {
        boolean modificado = modelFactory.modificarServicioLimpieza("Planchado de ropa", 890.98, modelFactory.getHabitacion(310), modelFactory.getCliente("1126543278"));
        System.out.println("El proceso de modificación del Servicio de Limpieza finalizó con un estado de: " + modificado);
    }

    public static void crudServicioRestaurante(ModelFactory modelFactory) {
        crearServicioRestaurante(modelFactory);
        leerServicioRestaurante(modelFactory);
        eliminarServicioRestaurante(modelFactory);
        modificarServicioRestaurante(modelFactory);
    }

    public static void crearServicioRestaurante(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearServicioRestaurante("Albondigas", 18.0, null, null);
        System.out.println("El proceso de creación del Servicio de Restaurante finalizó con un estado de: " + creado);
    }

    public static void leerServicioRestaurante(ModelFactory modelFactory) {
        Servicio leido = modelFactory.getServicioRestaurante("Banquete de Carne");
        System.out.println("El servicio de Restaurante leído es: " + leido);
    }

    private static void eliminarServicioRestaurante(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarServicioRestaurante("Banquete de Carne");
        System.out.println("El proceso de eliminación del Servicio de Restaurante finalizó con un estado de: " + eliminado);
    }

    public static void modificarServicioRestaurante(ModelFactory modelFactory) {
        boolean modificado = modelFactory.modificarServicioRestaurante("Vino y Gaseosas", 111.0, modelFactory.getHabitacion(310), null);
        System.out.println("El proceso de modificación del Servicio de Restaurante finalizó con un estado de: " + modificado);
    }

    public static void crudServicioSpa(ModelFactory modelFactory) {
        crearServicioSpa(modelFactory);
        leerServicioSpa(modelFactory);
        eliminarServicioSpa(modelFactory);
        modificarServicioSpa(modelFactory);
    }

    public static void crearServicioSpa(ModelFactory modelFactory) {
        boolean creado = modelFactory.crearServicioSpa("Masaje de Piedras", 600.0, null, null);
        System.out.println("El proceso de creación del Servicio de Spa finalizó con un estado de: " + creado);
    }

    public static void leerServicioSpa(ModelFactory modelFactory) {
        Servicio leido = modelFactory.getServicioSpa("Limpieza facial");
        System.out.println("El servicio de Spa leído es: " + leido);
    }

    private static void eliminarServicioSpa(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.eliminarServicioSpa("Limpieza facial");
        System.out.println("El proceso de eliminación del Spa de Habitación finalizó con un estado de: " + eliminado);
    }

    public static void modificarServicioSpa(ModelFactory modelFactory) {
        boolean modificado = modelFactory.modificarServicioSpa("Jacuzzi", 12.0, modelFactory.getHabitacion(205), null);
        System.out.println("El proceso de modificación del Spa de Habitación finalizó con un estado de: " + modificado);
    }



}