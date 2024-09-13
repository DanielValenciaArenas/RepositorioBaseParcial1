package co.edu.uniquindio.Hotel.parcial1.model;

import co.edu.uniquindio.Hotel.parcial1.model.builder.ClienteBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Hotel {

    private String nombre;
    private Collection<Reserva> listaReservas;
    private Collection<Habitacion> listaHabitaciones;
    private Collection<Cliente> listaClientes;
    private Collection<Servicio> listaServicios;

    /*
     * Metodo constructor de la clase Hotel
     */

    public Hotel(String nombre, Collection<Reserva> listaReservas, Collection<Habitacion> listaHabitaciones,
                 Collection<Cliente> listaClientes, Collection<Servicio> listaServicios) {
        this.nombre = nombre;
        this.listaReservas = listaReservas;
        this.listaHabitaciones = listaHabitaciones;
        this.listaClientes = listaClientes;
        this.listaServicios = listaServicios;
    }

    /*
     * Getters y Setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Collection<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public Collection<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(Collection<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Collection<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(Collection<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    //Metodos CRUD de CLIENTE

    public boolean crearCliente(String nombre, String dni, Collection<Reserva> reservasAsociadas, Collection<Servicio> serviciosAsociados) {
        Cliente clienteExistente = verificarCliente(dni);

        if (clienteExistente == null) {
            Cliente newCliente = new Cliente(nombre, dni, reservasAsociadas, serviciosAsociados);
            listaClientes.add(newCliente);
            return true;
        }
        return false;
    }

    private Cliente verificarCliente(String dni){
        Cliente clienteExistente = null;

        for (Cliente cliente : listaClientes){
            if(cliente.getDni().equals(dni)){
                clienteExistente = cliente;
                break;
            }
        }

        return clienteExistente;
    }

    public boolean eliminarCliente(String dni) {

        for (Cliente cliente : listaClientes){
            if(cliente.getDni().equals(dni)){
                listaClientes.remove(cliente);
                return true;
            }
        }

        return false;
    }

    public boolean modificarCliente(String nombre, String dni, Collection<Reserva> reservasAsociadas, Collection<Servicio> serviciosAsociados) {

        for (Cliente cliente: listaClientes) {
            if (cliente.getDni().equals(dni)) {
                cliente.setNombre(nombre);
                cliente.setReservasAsociadas(reservasAsociadas);
                cliente.setServiciosAsociados(serviciosAsociados);
                return true;
            }
        }
        return false;
    }

    public Cliente getCliente(String dni) {
        return verificarCliente(dni);
    }

    public Collection<Cliente> getClientes() {
        return listaClientes;
    }

    //Metodos CRUD de HABITACION

    public boolean crearHabitacion(int numero, TipoHabitacion tipoHabitacion, double precio, Reserva reservaAsociada, Collection<Servicio> listaServiciosAsociados) {
        Habitacion habitacionExistente = verificarHabitacion(numero);

        if (habitacionExistente == null) {
            Habitacion newHabitacion = new Habitacion(numero, tipoHabitacion, precio, reservaAsociada, listaServiciosAsociados);
            listaHabitaciones.add(newHabitacion);
            return true;
        }
        return false;
    }

    private Habitacion verificarHabitacion(int numero) {
        Habitacion habitacionExistente = null;

        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNumero() == numero) {
                habitacionExistente = habitacion;
                break;
            }
        }
        return habitacionExistente;
    }

    public boolean eliminarHabitacion(int numero) {

        for (Habitacion habitacion : listaHabitaciones){
            if(habitacion.getNumero() == numero){
                listaHabitaciones.remove(habitacion);
                return true;
            }
        }
        return false;
    }

    public boolean modificarHabitacion(int numero, TipoHabitacion tipoHabitacion, double precio, Reserva reservaAsociada, Collection<Servicio> listaServiciosAsociados) {

        for (Habitacion habitacion: listaHabitaciones) {
            if (habitacion.getNumero() == numero) {
                habitacion.setTipoHabitacion(tipoHabitacion);
                habitacion.setPrecio(precio);
                habitacion.setReservaAsociada(reservaAsociada);
                habitacion.setListaServiciosAsociados(listaServiciosAsociados);
                return true;
            }
        }
        return false;
    }

    public Habitacion getHabitacion(int numero) {
        return verificarHabitacion(numero);
    }

    public Collection<Habitacion> getHabitaciones() {
        return listaHabitaciones;
    }

    //Metodos CRUD de RESERVA

    public boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente clienteAsociado, Habitacion habitacionAsociada) {
        Reserva reservaExistente = verificarReserva(fechaEntrada, clienteAsociado);

        if (reservaExistente == null) {
            Reserva newReserva = new Reserva(fechaEntrada, fechaSalida, clienteAsociado, habitacionAsociada);
            listaReservas.add(newReserva);
            return true;
        }
        return false;
    }

    private Reserva verificarReserva(LocalDate fechaEntrada, Cliente clienteAsociado) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getFechaEntrada().equals(fechaEntrada) && reserva.getClienteAsociado().equals(clienteAsociado)) {
                return reserva;
            }
        }
        return null;
    }

    public boolean eliminarReserva(LocalDate fechaEntrada, Cliente clienteAsociado) {
        Reserva reserva = verificarReserva(fechaEntrada, clienteAsociado);

        if (reserva != null) {
            listaReservas.remove(reserva);
            return true;
        }
        return false;
    }

    public boolean modificarReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente clienteAsociado, Habitacion habitacionAsociada) {

        for (Reserva reserva : listaReservas) {
            if (reserva.getFechaEntrada().equals(fechaEntrada) && reserva.getClienteAsociado().equals(clienteAsociado)) {
                reserva.setFechaSalida(fechaSalida);
                reserva.setHabitacionAsociada(habitacionAsociada);
                return true;
            }
        }
        return false;
    }

    public Reserva getReserva(LocalDate fechaEntrada, Cliente clienteAsociado) {
        return verificarReserva(fechaEntrada, clienteAsociado);
    }

    public Collection<Reserva> getReservas() {
        return listaReservas;
    }

    //Metodos CRUD de SERVICIO DE HABITACION

    public boolean crearServicioHabitacion(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        ServicioHabitacion servicioHabitacionExistente = verificarServicioHabitacion(nombre);

        if (servicioHabitacionExistente == null) {
            ServicioHabitacion newServicioHabitacion = new ServicioHabitacion(nombre, precio, habitacionAsociada, clienteAsociado);
            listaServicios.add(newServicioHabitacion);
            return true;
        }
        return false;
    }

    private ServicioHabitacion verificarServicioHabitacion(String nombre) {
        for (Servicio servicio : listaServicios) {
            if (servicio instanceof ServicioHabitacion && servicio.getNombre().equals(nombre)) {
                return (ServicioHabitacion) servicio;
            }
        }
        return null;
    }

    public boolean eliminarServicioHabitacion(String nombre) {
        ServicioHabitacion servicio = verificarServicioHabitacion(nombre);

        if (servicio != null) {
            listaServicios.remove(servicio);
            return true;
        }
        return false;
    }

    public boolean modificarServicioHabitacion(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado) {
        ServicioHabitacion servicio = verificarServicioHabitacion(nombre);

        if (servicio != null) {
            servicio.setPrecio(nuevoPrecio);
            servicio.setHabitacionAsociada(nuevaHabitacionAsociada);
            servicio.setClienteAsociado(nuevoClienteAsociado);
            return true;
        }
        return false;
    }

    public ServicioHabitacion getServicioHabitacion(String nombre) {
        return verificarServicioHabitacion(nombre);
    }

    public Collection<ServicioHabitacion> getServiciosHabitacion() {
        Collection<ServicioHabitacion> serviciosHabitacion = new ArrayList<>();

        for (Servicio servicio : listaServicios) {
            if (servicio instanceof ServicioHabitacion) {
                serviciosHabitacion.add((ServicioHabitacion) servicio);
            }
        }
        return serviciosHabitacion;
    }

    // Métodos CRUD de SERVICIO DE LIMPIEZA

    public boolean crearServicioLimpieza(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        ServicioLimpieza servicioLimpiezaExistente = verificarServicioLimpieza(nombre);

        if (servicioLimpiezaExistente == null) {
            ServicioLimpieza newServicioLimpieza = new ServicioLimpieza(nombre, precio, habitacionAsociada, clienteAsociado);
            listaServicios.add(newServicioLimpieza);
            return true;
        }
        return false;
    }

    private ServicioLimpieza verificarServicioLimpieza(String nombre) {
        for (Servicio servicio : listaServicios) {
            if (servicio instanceof ServicioLimpieza && servicio.getNombre().equals(nombre)) {
                return (ServicioLimpieza) servicio;
            }
        }
        return null;
    }

    public boolean eliminarServicioLimpieza(String nombre) {
        ServicioLimpieza servicio = verificarServicioLimpieza(nombre);

        if (servicio != null) {
            listaServicios.remove(servicio);
            return true;
        }
        return false;
    }

    public boolean modificarServicioLimpieza(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado) {
        ServicioLimpieza servicio = verificarServicioLimpieza(nombre);

        if (servicio != null) {
            servicio.setPrecio(nuevoPrecio);
            servicio.setHabitacionAsociada(nuevaHabitacionAsociada);
            servicio.setClienteAsociado(nuevoClienteAsociado);
            return true;
        }
        return false;
    }

    public ServicioLimpieza getServicioLimpieza(String nombre) {
        return verificarServicioLimpieza(nombre);
    }

    public Collection<ServicioLimpieza> getServiciosLimpieza() {
        Collection<ServicioLimpieza> serviciosLimpieza = new ArrayList<>();

        for (Servicio servicio : listaServicios) {
            if (servicio instanceof ServicioLimpieza) {
                serviciosLimpieza.add((ServicioLimpieza) servicio);
            }
        }
        return serviciosLimpieza;
    }

    // Métodos CRUD de SERVICIO DE RESTAURANTE

    public boolean crearServicioRestaurante(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        ServicioRestaurante servicioRestauranteExistente = verificarServicioRestaurante(nombre);

        if (servicioRestauranteExistente == null) {
            ServicioRestaurante newServicioRestaurante = new ServicioRestaurante(nombre, precio, habitacionAsociada, clienteAsociado);
            listaServicios.add(newServicioRestaurante);
            return true;
        }
        return false;
    }

    private ServicioRestaurante verificarServicioRestaurante(String nombre) {
        for (Servicio servicio : listaServicios) {
            if (servicio instanceof ServicioRestaurante && servicio.getNombre().equals(nombre)) {
                return (ServicioRestaurante) servicio;
            }
        }
        return null;
    }

    public boolean eliminarServicioRestaurante(String nombre) {
        ServicioRestaurante servicio = verificarServicioRestaurante(nombre);

        if (servicio != null) {
            listaServicios.remove(servicio);
            return true;
        }
        return false;
    }

    public boolean modificarServicioRestaurante(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado) {
        ServicioRestaurante servicio = verificarServicioRestaurante(nombre);

        if (servicio != null) {
            servicio.setPrecio(nuevoPrecio);
            servicio.setHabitacionAsociada(nuevaHabitacionAsociada);
            servicio.setClienteAsociado(nuevoClienteAsociado);
            return true;
        }
        return false;
    }

    public ServicioRestaurante getServicioRestaurante(String nombre) {
        return verificarServicioRestaurante(nombre);
    }

    public Collection<ServicioRestaurante> getServiciosRestaurante() {
        Collection<ServicioRestaurante> serviciosRestaurante = new ArrayList<>();

        for (Servicio servicio : listaServicios) {
            if (servicio instanceof ServicioRestaurante) {
                serviciosRestaurante.add((ServicioRestaurante) servicio);
            }
        }
        return serviciosRestaurante;
    }

    //Metodos CRUD de SERVICIO DE SPA

    public boolean crearServicioSpa(String nombre, double precio, Habitacion habitacionAsociada, Cliente clienteAsociado) {
        ServicioSpa servicioSpaExistente = verificarServicioSpa(nombre);

        if (servicioSpaExistente == null) {
            ServicioSpa newServicioSpa = new ServicioSpa(nombre, precio, habitacionAsociada, clienteAsociado);
            listaServicios.add(newServicioSpa);
            return true;
        }
        return false;
    }

    private ServicioSpa verificarServicioSpa(String nombre) {
        for (Servicio servicio : listaServicios) {
            if (servicio instanceof ServicioSpa && servicio.getNombre().equals(nombre)) {
                return (ServicioSpa) servicio;
            }
        }
        return null;
    }

    public boolean eliminarServicioSpa(String nombre) {
        ServicioSpa servicio = verificarServicioSpa(nombre);

        if (servicio != null) {
            listaServicios.remove(servicio);
            return true;
        }
        return false;
    }

    public boolean modificarServicioSpa(String nombre, double nuevoPrecio, Habitacion nuevaHabitacionAsociada, Cliente nuevoClienteAsociado) {
        ServicioSpa servicio = verificarServicioSpa(nombre);

        if (servicio != null) {
            servicio.setPrecio(nuevoPrecio);
            servicio.setHabitacionAsociada(nuevaHabitacionAsociada);
            servicio.setClienteAsociado(nuevoClienteAsociado);
            return true;
        }
        return false;
    }

    public ServicioSpa getServicioSpa(String nombre) {
        return verificarServicioSpa(nombre);
    }

    public Collection<ServicioSpa> getServiciosSpa() {
        Collection<ServicioSpa> serviciosSpa = new ArrayList<>();

        for (Servicio servicio : listaServicios) {
            if (servicio instanceof ServicioSpa) {
                serviciosSpa.add((ServicioSpa) servicio);
            }
        }
        return serviciosSpa;
    }


}