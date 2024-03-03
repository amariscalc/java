package main;

import persona.Persona;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creación de una persona
		Persona vecino1 = new Persona ("Alberto","Mariscal",1988);
		
		// Utilizar el método get para obtener el nombre de la persona y año de nacimiento, ya que estos atributos son privados y solo es posible con el método get
		System.out.println("Nombre: "+vecino1.getName()+". Año nacimiento: "+vecino1.getYB()); // Nombre: Alberto. Año nacimiento: 1988
		
		// Utilizar el método set para cambiar los valores de los atributos
		vecino1.setName("Paco");
		vecino1.setYB(2000);
		System.out.println("Nombre: "+vecino1.getName()+". Año nacimiento: "+vecino1.getYB()); // Nombre: Paco. Año nacimiento: 2000
		
	}
}
