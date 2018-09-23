package Parcial;

public class Museo1 implements Museo
{

	@Override
	public void reservarvisitaguiada(String fecha)
	{
		// TODO Auto-generated method stub
		System.out.println("ud reservo una visita para la fecha :" + fecha);
	}

	@Override
	public void consultarvisitaguiada(String fecha)
	{
		// TODO Auto-generated method stub
		System.out.println("ud consulto la visita guiada de la fecha" + fecha);

	}

}
