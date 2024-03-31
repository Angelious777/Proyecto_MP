package ProyectoMC;
import java.util.Scanner;
public class ColaCircular_AR extends Cola_AR{

	Scanner sc=new Scanner(System.in);
	
	public ColaCircular_AR() 
	{
		super();
	}
	public boolean esVacia ()
	{
		if (ini == fin)
			return true;
		return false;
	}
	public boolean esLlena ()
	{
		if (nroElementos() == MAX-1)
			return true;
		return false;
	}
	public void adicionar (Animal a)
	{
		if (esLlena ())
			System.out.println ("Cola Circular Llena");
		else
		{
			fin = (fin + 1) % MAX;
			v [fin] = a;
		}
	}
	public Animal eliminar ()
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
	public void leer (int n){
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.println ();
			Animal a=new Animal();
			a.leer();
			adicionar (a);
		}
	}
	public void vaciar (ColaCircular_AR aux)
	{
		while (!aux.esVacia ())
			adicionar (aux.eliminar ());
	}
	public void mostrar ()
	{
		Animal a;
		for (int i = 1 ; i <= nroElementos() ; i++)
		{
			a=eliminar ();
			a.mostrar();
			adicionar (a);
		}
	}
	public int nroElementos()
	{
		int nro = (fin - ini + MAX) % MAX;
		return (nro);
	}
}
