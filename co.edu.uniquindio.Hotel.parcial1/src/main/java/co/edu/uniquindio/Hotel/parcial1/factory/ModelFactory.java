package co.edu.uniquindio.Hotel.parcial1.factory;

import co.edu.uniquindio.Hotel.parcial1.model.*;
import co.edu.uniquindio.Hotel.parcial1.services.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class ModelFactory implements ICrudCliente, ICrudHabitacion, ICrudReserva,
        ICrudServicioHabitacion, ICrudServicioLimpieza, ICrudServicioRestaurante, ICrudServicioSpa {

    private static ModelFactory instance;
    private static Hotel hotel;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }



    /*
     * Metodo de Inicializar Datos
     */
    public static void inicializarDatos(){

        Collection<Reserva> listaReservas = new ArrayList<>();
        Collection<Habitacion> listaHabitaciones = new ArrayList<>();
        Collection<Cliente> listaClientes = new ArrayList<>();
        Collection<Servicio> listaServicios = new ArrayList<>();

        hotel = new Hotel(null, listaReservas, listaHabitaciones, listaClientes, listaServicios);
        hotel.setNombre("Hotel Ritz");

        //CLIENTES

        Cliente cliente1 = Cliente.builder()
                .nombre("Mateo")
                .dni("1098234154")
                .build();

        Cliente cliente2 = Cliente.builder()
                .nombre("Sasha")
                .dni("1126543278")
                .build();

        Cliente cliente3 = Cliente.builder()
                .nombre("Tanya")
                .dni("1452129951")
                .build();

        Cliente cliente4 = Cliente.builder()
                .nombre("Marco")
                .dni("1010023192")
                .build();

        //HABITACIONES

        Habitacion habitacion1 = Habitacion.builder()
                .numero(101)
                .tipoHabitacion(TipoHabitacion.SIMPLE)
                .precio(2300000.0)
                .build();

        Habitacion habitacion2 = Habitacion.builder()
                .numero(205)
                .tipoHabitacion(TipoHabitacion.SIMPLE)
                .precio(1258000.0)
                .build();

        Habitacion habitacion3 = Habitacion.builder()
                .numero(310)
                .tipoHabitacion(TipoHabitacion.DOBLE)
                .precio(6378800.0)
                .build();

        Habitacion habitacion4 = Habitacion.builder()
                .numero(403)
                .tipoHabitacion(TipoHabitacion.SUITE)
                .precio(15600000.0)
                .build();

        //RESERVAS

        Reserva reserva1 = Reserva.builder()
                .fechaEntrada(LocalDate.of(2024, 2, 16))
                .fechaSalida(LocalDate.of(2024, 3, 1))
                .build();
                reserva1.setClienteAsociado(cliente1);
                reserva1.setHabitacionAsociada(habitacion1);

        Reserva reserva2 = Reserva.builder()
                .fechaEntrada(LocalDate.of(2024, 1, 22))
                .fechaSalida(LocalDate.of(2024, 1, 23))
                .build();
                reserva2.setClienteAsociado(cliente2);
                reserva2.setHabitacionAsociada(habitacion2);

        Reserva reserva3 = Reserva.builder()
                .fechaEntrada(LocalDate.of(2024, 5, 12))
                .fechaSalida(LocalDate.of(2024, 7, 9))
                .build();
                reserva3.setClienteAsociado(cliente3);
                reserva3.setHabitacionAsociada(habitacion3);

        Reserva reserva4 = Reserva.builder()
                .fechaEntrada(LocalDate.of(2024, 1, 22))
                .fechaSalida(LocalDate.of(2024, 1, 23))
                .build();
                reserva4.setClienteAsociado(cliente4);
                reserva4.setHabitacionAsociada(habitacion4);

        //SERVICIOS DE HABITACION

        ServicioHabitacion servicioHabitacion1 = ServicioHabitacion.builder()
                .nombre("Cobijas")
                .precio(10000.0)
                .build();
                servicioHabitacion1.setClienteAsociado(cliente1);
                servicioHabitacion1.setHabitacionAsociada(habitacion1);

        ServicioHabitacion servicioHabitacion2 = ServicioHabitacion.builder()
                .nombre("Desayuno")
                .precio(52700.25)
                .build();
                servicioHabitacion2.setClienteAsociado(cliente1);
                servicioHabitacion2.setHabitacionAsociada(habitacion1);

        ServicioHabitacion servicioHabitacion3 = ServicioHabitacion.builder()
                .nombre("Llaves de repuesto")
                .precio(6000.0)
                .build();
                servicioHabitacion3.setClienteAsociado(cliente2);
                servicioHabitacion3.setHabitacionAsociada(habitacion2);

        ServicioHabitacion servicioHabitacion4 = ServicioHabitacion.builder()
                .nombre("Sabanas")
                .precio(22100.15)
                .build();
                servicioHabitacion4.setClienteAsociado(cliente3);
                servicioHabitacion4.setHabitacionAsociada(habitacion3);

        //SERVICIOS DE LIMPIEZA

        ServicioLimpieza servicioLimpieza1 = ServicioLimpieza.builder()
                .nombre("Barrido")
                .precio(50000.0)
                .build();
                 servicioLimpieza1.setClienteAsociado(cliente4);
                 servicioLimpieza1.setHabitacionAsociada(habitacion4);

        ServicioLimpieza servicioLimpieza2 = ServicioLimpieza.builder()
                .nombre("Trapeado")
                .precio(50000.0)
                .build();
                servicioLimpieza2.setClienteAsociado(cliente4);
                servicioLimpieza2.setHabitacionAsociada(habitacion4);

        ServicioLimpieza servicioLimpieza3 = ServicioLimpieza.builder()
                .nombre("Planchado de ropa")
                .precio(12500.10)
                .build();
                servicioLimpieza3.setClienteAsociado(cliente3);
                servicioLimpieza3.setHabitacionAsociada(habitacion3);

        ServicioLimpieza servicioLimpieza4 = ServicioLimpieza.builder()
                .nombre("Lavado de Baño")
                .precio(89700.11)
                .build();
                servicioLimpieza4.setClienteAsociado(cliente2);
                servicioLimpieza4.setHabitacionAsociada(habitacion2);

        // SERVICIOS DE RESTAURANTE

        ServicioRestaurante servicioRestaurante1 = ServicioRestaurante.builder()
                .nombre("Café con Leche")
                .precio(13000.23)
                .build();
                servicioRestaurante1.setClienteAsociado(cliente1);
                servicioRestaurante1.setHabitacionAsociada(habitacion1);

        ServicioRestaurante servicioRestaurante2 = ServicioRestaurante.builder()
                .nombre("Banquete de Carne")
                .precio(100000.0)
                .build();
                servicioRestaurante2.setClienteAsociado(cliente2);
                servicioRestaurante2.setHabitacionAsociada(habitacion2);

        ServicioRestaurante servicioRestaurante3 = ServicioRestaurante.builder()
                .nombre("Vino y Gaseosas")
                .precio(78400.0)
                .build();
                servicioRestaurante3.setClienteAsociado(cliente3);
                servicioRestaurante3.setHabitacionAsociada(habitacion3);

        ServicioRestaurante servicioRestaurante4 = ServicioRestaurante.builder()
                .nombre("Jugos naturales y Ensaladas")
                .precio(55500.25)
                .build();
                servicioRestaurante4.setClienteAsociado(cliente4);
                servicioRestaurante4.setHabitacionAsociada(habitacion4);

        // SERVICIOS DE SPA

        ServicioSpa servicioSpa1 = ServicioSpa.builder()
                .nombre("Masaje Sueco")
                .precio(50000.0)
                .build();
                servicioSpa1.setClienteAsociado(cliente3);
                servicioSpa1.setHabitacionAsociada(habitacion3);

        ServicioSpa servicioSpa2 = ServicioSpa.builder()
                .nombre("Hidroterapia")
                .precio(120000.0)
                .build();
                servicioSpa2.setClienteAsociado(cliente3);
                servicioSpa2.setHabitacionAsociada(habitacion3);

        ServicioSpa servicioSpa3 = ServicioSpa.builder()
                .nombre("Limpieza facial")
                .precio(98200.89)
                .build();
                servicioSpa3.setClienteAsociado(cliente1);
                servicioSpa3.setHabitacionAsociada(habitacion1);

        ServicioSpa servicioSpa4 = ServicioSpa.builder()
                .nombre("Jacuzzi")
                .precio(230000.0)
                .build();
                servicioSpa4.setClienteAsociado(cliente4);
                servicioSpa4.setHabitacionAsociada(habitacion4);

        // Adición de Reserva y Servicios asociados a los clientes (en sus listas)

        cliente1.getReservasAsociadas().add(reserva1);
        cliente1.getServiciosAsociados().add(servicioHabitacion1);
        cliente1.getServiciosAsociados().add(servicioHabitacion2);
        cliente1.getServiciosAsociados().add(servicioRestaurante1);
        cliente1.getServiciosAsociados().add(servicioSpa3);

        cliente2.getReservasAsociadas().add(reserva2);
        cliente2.getServiciosAsociados().add(servicioHabitacion3);
        cliente2.getServiciosAsociados().add(servicioLimpieza4);
        cliente2.getServiciosAsociados().add(servicioRestaurante2);

        cliente3.getReservasAsociadas().add(reserva3);
        cliente3.getServiciosAsociados().add(servicioHabitacion4);
        cliente3.getServiciosAsociados().add(servicioLimpieza3);
        cliente3.getServiciosAsociados().add(servicioRestaurante3);
        cliente3.getServiciosAsociados().add(servicioSpa1);
        cliente3.getServiciosAsociados().add(servicioSpa2);

        cliente4.getReservasAsociadas().add(reserva4);
        cliente4.getServiciosAsociados().add(servicioLimpieza1);
        cliente4.getServiciosAsociados().add(servicioLimpieza2);
        cliente4.getServiciosAsociados().add(servicioRestaurante4);
        cliente4.getServiciosAsociados().add(servicioSpa4);

        // Adición de la info. a las listas del Hotel

        listaReservas.add(reserva1);
        listaReservas.add(reserva2);
        listaReservas.add(reserva3);
        listaReservas.add(reserva4);

        listaHabitaciones.add(habitacion1);
        listaHabitaciones.add(habitacion2);
        listaHabitaciones.add(habitacion3);
        listaHabitaciones.add(habitacion4);

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);

        listaServicios.add(servicioHabitacion1);
        listaServicios.add(servicioHabitacion2);
        listaServicios.add(servicioHabitacion3);
        listaServicios.add(servicioHabitacion4);
        listaServicios.add(servicioLimpieza1);
        listaServicios.add(servicioLimpieza2);
        listaServicios.add(servicioLimpieza3);
        listaServicios.add(servicioLimpieza4);
        listaServicios.add(servicioRestaurante1);
        listaServicios.add(servicioRestaurante2);
        listaServicios.add(servicioRestaurante3);
        listaServicios.add(servicioRestaurante4);
        listaServicios.add(servicioSpa1);
        listaServicios.add(servicioSpa2);
        listaServicios.add(servicioSpa3);
        listaServicios.add(servicioSpa4);



    }


    // Implementacion de ICrudCliente

    @Override
    public boolean crearCliente(String nombre, String dni, Collection<Reserva> reservasAsociadas, Collection<Servicio> serviciosAsociados) {
        return hotel.crearCliente(nombre, dni, reservasAsociadas, serviciosAsociados);
    }

    @Override
    public Cliente getCliente(String dni) {
        return hotel.getCliente(dni);
    }

    @Override
    public boolean modificarCliente(String nombre, String dni, Collection<Reserva> reservasAsociadas, Collection<Servicio> serviciosAsociados) {
        return hotel.modificarCliente(nombre, dni, reservasAsociadas, serviciosAsociados);
    }

    @Override
    public boolean eliminarCliente(String dni) {
        return hotel.eliminarCliente(dni);
    }

    @Override
    public Collection<Cliente> getClientes() {
        return hotel.getClientes();
    }

    // Implementacion de ICrudHabitacion

    @Override
    public boolean crearHabitacion(int numero, TipoHabitacion tipoHabitacion, double precio, Reserva reservaAsociada, Collection<Servicio> listaServicios) {
        return hotel.crearHabitacion(numero, tipoHabitacion, precio, reservaAsociada, listaServicios);
    }

    @Override
    public Habitacion getHabitacion(int numero) {
        return hotel.getHabitacion(numero);
    }

    @Override
    public boolean modificarHabitacion(int numero, TipoHabitacion tipoHabitacion, double precio, Reserva reservaAsociada, Collection<Servicio> listaServicios) {
        return hotel.modificarHabitacion(numero, tipoHabitacion, precio, reservaAsociada, listaServicios);
    }

    @Override
    public boolean eliminarHabitacion(int numero) {
        return hotel.eliminarHabitacion(numero);
    }

    @Override
    public Collection<Habitacion> getHabitaciones() {
        return hotel.getHabitaciones();
    }

    // Implementacion de ICrudReserva

    @Override
    public boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente clienteAsociado, Habitacion habitacionAsociada) {
        return hotel.crearReserva(fechaEntrada, fechaSalida, clienteAsociado, habitacionAsociada);
    }

    @Override
    public Reserva getReserva(LocalDate fechaEntrada, Cliente clienteAsociado) {
        return hotel.getReserva(fechaEntrada, clienteAsociado);
    }

    @Override
    public boolean modificarReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente clienteAsociado, Habitacion habitacionAsociada) {
        return hotel.modificarReserva(fechaEntrada, fechaSalida, clienteAsociado, habitacionAsociada);
    }

    @Override
    public boolean eliminarReserva(LocalDate fechaEntrada, Cliente clienteAsociado) {
        return hotel.eliminarReserva(fechaEntrada, clienteAsociado);
    }

    @Override
    public Collection<Reserva> getReservas() {
        return hotel.getReservas();
    }

    // Implementacion de ICrudServicioHabitacion

    @Override
    public boolean crearServicioHabitacion(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        return hotel.crearServicioHabitacion(nombre, precio, habitacionAsociada, clienteAsociado);
    }

    @Override
    public ServicioHabitacion getServicioHabitacion(String nombre) {
        return hotel.getServicioHabitacion(nombre);
    }

    @Override
    public boolean modificarServicioHabitacion(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado) {
        return hotel.modificarServicioHabitacion(nombre, nuevoPrecio, nuevaHabitacionAsociada, nuevoClienteAsociado);
    }

    @Override
    public boolean eliminarServicioHabitacion(String nombre) {
        return hotel.eliminarServicioHabitacion(nombre);
    }

    @Override
    public Collection<ServicioHabitacion> getServiciosHabitacion() {
        return hotel.getServiciosHabitacion();
    }

    // Implementacion ICrudServicioLimpieza

    @Override
    public boolean crearServicioLimpieza(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        return hotel.crearServicioLimpieza(nombre, precio, habitacionAsociada, clienteAsociado);
    }

    @Override
    public ServicioLimpieza getServicioLimpieza(String nombre) {
        return hotel.getServicioLimpieza(nombre);
    }

    @Override
    public boolean modificarServicioLimpieza(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado) {
        return hotel.modificarServicioLimpieza(nombre, nuevoPrecio, nuevaHabitacionAsociada, nuevoClienteAsociado);
    }

    @Override
    public boolean eliminarServicioLimpieza(String nombre) {
        return hotel.eliminarServicioLimpieza(nombre);
    }

    @Override
    public Collection<ServicioLimpieza> getServiciosLimpieza() {
        return hotel.getServiciosLimpieza();
    }

    // Implementacion de ICrudServicioRestaurante

    @Override
    public boolean crearServicioRestaurante(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        return hotel.crearServicioRestaurante(nombre, precio, habitacionAsociada, clienteAsociado);
    }

    @Override
    public ServicioRestaurante getServicioRestaurante(String nombre) {
        return hotel.getServicioRestaurante(nombre);
    }

    @Override
    public boolean modificarServicioRestaurante(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado) {
        return hotel.modificarServicioRestaurante(nombre, nuevoPrecio, nuevaHabitacionAsociada, nuevoClienteAsociado);
    }

    @Override
    public boolean eliminarServicioRestaurante(String nombre) {
        return hotel.eliminarServicioRestaurante(nombre);
    }

    @Override
    public Collection<ServicioRestaurante> getServiciosRestaurante() {
        return hotel.getServiciosRestaurante();
    }

    // Implementacion de ICrudServicioSpa

    @Override
    public boolean crearServicioSpa(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        return hotel.crearServicioSpa(nombre, precio, habitacionAsociada, clienteAsociado);
    }

    @Override
    public ServicioSpa getServicioSpa(String nombre) {
        return hotel.getServicioSpa(nombre);
    }

    @Override
    public boolean modificarServicioSpa(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado) {
        return hotel.modificarServicioSpa(nombre, nuevoPrecio, nuevaHabitacionAsociada, nuevoClienteAsociado);
    }

    @Override
    public boolean eliminarServicioSpa(String nombre) {
        return hotel.eliminarServicioSpa(nombre);
    }

    @Override
    public Collection<ServicioSpa> getServiciosSpa() {
        return hotel.getServiciosSpa();
    }

}
