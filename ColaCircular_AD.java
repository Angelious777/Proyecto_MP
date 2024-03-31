package ProyectoMC;

public class ColaCircular_AD extends Cola_AD{
	public
	ColaCircular_AD() 
	{
		super();
	}
	
	boolean esVacia ()
	{
		if (ini == fin)
			return true;
		return false;
	}
	
	boolean esLlena ()
	{
		if (nroElementos() == MAX-1)
			return true;
		return false;
	}
	void adicionar (Animal a)
	{
		if (esLlena ())
			System.out.println ("Cola Circular Llena");
		else
		{
			fin = (fin + 1) % MAX;
			v [fin] = a;
		}
	}
	Animal eliminar ()
	{
		Animal a=null;
		if (esVacia ())
			System.out.println ("Cola Circular Vacia");
		else
		{
			ini = (ini + 1) % MAX;
			a = v [ini];
		}
		return a;
	}
	void leer (int n){
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.println ();
			Animal a=new Animal();
			a.leer();
			adicionar (a);
		}
	}
	void vaciar (ColaCircular_AR aux)
	{
		while (!aux.esVacia ())
			adicionar (aux.eliminar ());
	}
	void mostrar ()
	{
		Animal a;
		for (int i = 1 ; i <= nroElementos() ; i++)
		{
			a=eliminar ();
			a.mostrar();
			adicionar (a);
		}
	}
	int nroElementos()
	{
		int nro = (fin - ini + MAX) % MAX;
		return (nro);
	}
}
