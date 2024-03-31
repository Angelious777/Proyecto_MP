package ProyectoMC;

public class AppAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaCircular_AR AR = new ColaCircular_AR();
		
		Animal a1 = new Animal("pancho","albino",23.23,"mediano","negro","adulto");
		Animal a2 = new Animal("nose","albino",23.23,"mediano","rojo","adulto");
		Animal a3 = new Animal("chancho","albino",23.23,"mediano","verde","adulto");
		
		AR.adicionar(a1);
		AR.adicionar(a2);
		AR.adicionar(a3);
		
		AR.mostrar();
		
	}

}
