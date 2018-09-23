package Parcial;

public class Restaurant1 implements Restaurant
{

	@Override
	public void reservarmesa(String fecha)
	{
		// TODO Auto-generated method stub
		System.out.println("reserva de mesa para la fecha " + fecha);

	}

	@Override
	public void consultarmesa(String fecha)
	{
		// TODO Auto-generated method stub
		System.out.println("ud consulto la mesa para la fecha " + fecha);
	}

}
