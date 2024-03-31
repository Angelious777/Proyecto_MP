package ProyectoMC;

import java.util.*;

public class Animal {
	private
	String nombre;
	String raza;
	double peso;
	String proporcion;
	// proporcion: animal pequeno, animal grande o animal mediano
	String color;
	String etapa;
	
	public
	Animal() {
		nombre = null;
		raza = null;
		peso = 0;
		proporcion = null;
		color = null;
		etapa = null;
	}
	Animal(String nombre, String raza, double peso, String proporcion, String color, String etapa){
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.proporcion = proporcion;
		this.color = color;
		this.etapa = etapa;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getProporcion() {
		return proporcion;
	}
	public void setProporcion(String proporcion) {
		this.proporcion = proporcion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	
	
	Scanner sc = new Scanner(System.in);
	
	void leer() {
		System.out.print("Ingrese Nombre del animal: ");
		nombre = sc.next();
		System.out.print("Ingrese Raza del animal: ");
		raza = sc.next();
		System.out.print("Ingrese el Peso de animal: ");
		peso = sc.nextDouble();
		System.out.print("Ingrese la proporcion del animal: ");
		proporcion = sc.next();
		System.out.print("Ingrese el color del animal: ");
		color = sc.next();
		System.out.print("Ingrese la etapa del animal (Cachorro, adulto, senior): ");
		etapa = sc.next();
	}
	
	void mostrar() {
		System.out.println();
		System.out.println("----ANIMAL----");
		System.out.println("Nombre animal: "+nombre);
		System.out.println("Raza: "+raza);
		System.out.println("Peso: "+peso);
		System.out.println("Proporcion: "+proporcion);
		System.out.println("Color: "+color);
		System.out.println("Etapa: "+etapa);
		System.out.println();
	}
}
