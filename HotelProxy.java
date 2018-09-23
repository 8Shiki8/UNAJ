package Parcial;

import java.util.ArrayList;

public class HotelProxy implements Hotel
{
	private Hotel1 hotel = null;
	private static ArrayList<String> lista2 = new ArrayList<String>();

	@Override
	public void reservarhabitacion(int numero, String fecha)
	{
		// TODO Auto-generated method stub
		if (hotel == null)
		{
			hotel = new Hotel1();
			hotel.setlista(this.lista2);
		}
		hotel.reservarhabitacion(numero, fecha);
		for (String elem : this.lista2)
		{
			hotel.acordarpromociones(elem);
		}
	}

	@Override
	public void acordarpromociones(String contrato)
	{
		// TODO Auto-generated method stub

		lista2.add(contrato);

	}

	@Override
	public void consultarhabitacion(String fecha)
	{
		// TODO Auto-generated method stub
		if (hotel == null)
		{
			hotel = new Hotel1();
			hotel.setlista(this.lista2);
		}
		hotel.consultarhabitacion(fecha);
		for (String elem : this.lista2)
		{
			hotel.acordarpromociones(elem);
		}
	}

}
