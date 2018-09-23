package Parcial;

import java.util.Scanner;

public class Gerencia1 implements Gerencia
{
	Scanner teclado = new Scanner(System.in);

	@Override
	public void acordarpromociones()
	{
		// TODO Auto-generated method stub
		String contrato;
		System.out.println("ingrese el contrato de promocion");
		contrato = teclado.nextLine();
		HotelProxy hotel = new HotelProxy();
		hotel.acordarpromociones(contrato);
	}

	@Override
	public void firmarconvenio()
	{
		// TODO Auto-generated method stub
		String convenio;
		System.out.println("ingrese el convenio");
		convenio = teclado.nextLine();
		Aerolinea1 aerolinea = new Aerolinea1();
		aerolinea.firmarvuelo(convenio);
	}

}
