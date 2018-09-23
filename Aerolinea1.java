package Parcial;

public class Aerolinea1 implements Aerolinea
{

	@Override
	public void reservarvuelo(int asiento, String fecha)
	{
		System.out.println("reservo un vuelo para " + fecha + " y tiene el asiento " + asiento);

	}

	@Override
	public void firmarvuelo(String convenio)
	{
		// TODO Auto-generated method stub
		System.out.println("listado de convenios : " + convenio);

	}

	@Override
	public void consultarvuelo(String fecha)
	{

		System.out.println("ud consulto el vuelo de la fecha " + fecha);

	}

}
