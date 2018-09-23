package Parcial;

import java.util.Scanner;

public class OficinaDeReserva1 implements OficinaDeReserva
{
	Scanner teclado = new Scanner(System.in);

	@Override
	public void reservarhabitacion()
	{
		int numero;
		String fecha;
		System.out.println("ingrese numero de habitacion a reservar para hotel");
		numero = Integer.valueOf(teclado.nextLine());
		System.out.println("ingrese fecha de reserva para hotel");
		fecha = teclado.nextLine();
		HotelProxy hotel = new HotelProxy();
		hotel.reservarhabitacion(numero, fecha);

	}

	@Override
	public void reservarvuelo()
	{
		int asiento;
		String fecha;
		System.out.println("ingrese numero de asiento a reservar para vuelo");
		asiento = Integer.valueOf(teclado.nextLine());
		System.out.println("ingrese fecha de reserva para vuelo");
		fecha = teclado.nextLine();
		Aerolinea1 aerolinea = new Aerolinea1();
		aerolinea.reservarvuelo(asiento, fecha);
	}

	@Override
	public void reservarmesa()
	{

		String fecha;

		System.out.println("ingrese fecha de reserva de restaurant");
		fecha = teclado.nextLine();
		Restaurant1 restaurant = new Restaurant1();
		restaurant.reservarmesa(fecha);

	}

	@Override
	public void reservarvisitaguiada()
	{
		// TODO Auto-generated method stub

		String fecha;

		System.out.println("ingrese fecha de reserva de visita guiada");
		fecha = teclado.nextLine();
		Museo1 museo = new Museo1();
		museo.reservarvisitaguiada(fecha);

	}

}
