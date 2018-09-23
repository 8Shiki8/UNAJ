package Parcial;

public class Facade
{
	private AtencionAlPublico1 atencionp;
	private OficinaDeReserva1 oficinar;
	private Gerencia1 gerencia;

	public void facade_ejercicio2()
	{
		atencionp.consultarhabitacion();
		atencionp.consultarmesa();
		atencionp.consultarvisitaguiada();
		atencionp.consultarvuelo();

		oficinar.reservarhabitacion();
		oficinar.reservarmesa();
		oficinar.reservarvisitaguiada();
		oficinar.reservarvuelo();

		gerencia.acordarpromociones();
		gerencia.firmarconvenio();
	}

	public void facade_ejercicio4()
	{

		gerencia.acordarpromociones();
		gerencia.firmarconvenio();

		atencionp.consultarmesa();
		atencionp.consultarvuelo();

		oficinar.reservarvisitaguiada();
		oficinar.reservarhabitacion();

	}

	public Facade()
	{
		this.atencionp = new AtencionAlPublico1();
		this.oficinar = new OficinaDeReserva1();
		this.gerencia = new Gerencia1();
	}
}
