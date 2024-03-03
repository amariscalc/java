package main;

import persona.Persona;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creación de una persona
		Persona vecino1 = new Persona ("Alberto","Mariscal",2013);
		
		// Se utiliza un método get para obtener el nombre de la persona, ya que el atributo es privado y solo es posible con el método get
		System.out.println("Nombre: "+vecino1.getName()+". Año nacimiento: "+vecino1.getYB()); // Nombre: Alberto. Año nacimiento: 2013

		// Comprobar si es mayor de edad
		vecino1.more18();
		
		// Utilizar el método set para cambiar valor de un atributo
		vecino1.setName("Paco");
		vecino1.setYB(2000);
		System.out.println("Nombre: "+vecino1.getName()+". Año nacimiento: "+vecino1.getYB()); // Nombre: Paco. Año nacimiento: 2000
		vecino1.more18();
				
	}
}
