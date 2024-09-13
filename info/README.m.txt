DANIEL VALENCIA ARENAS - PARCIAL I

Sistema de Reservas de Hotel
Contexto: Un sistema para gestionar reservas, habitaciones, clientes y servicios en un hotel.
Clases:
	Habitación: Atributos incluyen número, tipo (simple, doble, suite), y precio.
	Reserva: Relaciona una habitación con un cliente e incluye fechas de entrada y salida.
	Cliente: Atributos incluyen nombre, DNI y reservas activas.
	Servicio: Clase base para servicios ofrecidos como spa, restaurante, y limpieza.
	ServicioDeHabitación: Hereda de Servicio, específico para servicios solicitados a la habitación.
Relaciones:
	Un Cliente puede tener varias Reservas.
	Una Reserva está asociada a una Habitación.
	Habitación puede tener asociados múltiples Servicios, incluyendo ServicioDeHabitación.
Herencia:
	ServicioDeHabitación hereda de Servicio.
Polimorfismo:
	Servicio puede implementar una interfaz Consumible con un método consumir(), que se implementa de manera diferente en ServicioDeHabitación y otros servicios, como spa o restaurante.
