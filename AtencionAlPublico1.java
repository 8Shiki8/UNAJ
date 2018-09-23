package Parcial;

import java.util.Scanner;

public class AtencionAlPublico1 implements AtencionAlPublico
{

	Scanner teclado = new Scanner(System.in);

	@Override
	public void consultarhabitacion()
	{
		// TODO Auto-generated method stub
		String fecha;
		System.out.println("ingrese la fecha para consultar en el hotel");
		fecha = teclado.nextLine();
		HotelProxy hotel = new HotelProxy();
		hotel.consultarhabitacion(fecha);

	}

	@Override
	public void consultarvuelo()
	{
		// TODO Auto-generated method stub
		String fecha;
		System.out.println("ingrese la fecha a consultar en la aerolinea");
		fecha = teclado.nextLine();
		Aerolinea1 aerolinea = new Aerolinea1();
		aerolinea.consultarvuelo(fecha);
	}

	@Override
	public void consultarmesa()
	{
		// TODO Auto-generated method stub
		String fecha;
		System.out.println("ingrese la fecha a consultar en el restaurant");
		fecha = teclado.nextLine();
		Restaurant1 restaurant = new Restaurant1();
		restaurant.consultarmesa(fecha);
	}

	@Override
	public void consultarvisitaguiada()
	{
		// TODO Auto-generated method stub
		String fecha;
		System.out.println("ingrese la fecha a consultar para la visita guiada");
		fecha = teclado.nextLine();
		Museo1 museo = new Museo1();
		museo.consultarvisitaguiada(fecha);
	}

}
