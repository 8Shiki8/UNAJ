package Parcial;

import java.util.ArrayList;

public class Hotel1 implements Hotel
{
	private ArrayList<String> lista;

	public void setlista(ArrayList<String> lista)
	{
		this.lista = lista;
	}

	public ArrayList<String> getlista()
	{
		return this.getlista();
	}

	@Override
	public void reservarhabitacion(int numero, String fecha)
	{
		System.out.println("usted reservo la habitacion " + numero + "para la fecha" + fecha);

	}

	@Override
	public void acordarpromociones(String contrato)
	{
		// TODO Auto-generated method stub
		System.out.println(" contrato de promocion  : " + contrato);

	}

	@Override
	public void consultarhabitacion(String fecha)
	{
		// TODO Auto-generated method stub
		System.out.println("ud consulto la habitacion de la fecha " + fecha);

	}

}
