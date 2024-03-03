package persona;

import java.time.LocalDate;

public class Persona {
	
	// Definición de los atributos de la clase Persona
	private String name;
	private String surname;
	private char sex;
	private int yearBirth;
	private String city;
	
	//Aplicamos sobre carga de métodos
	
	// Constructor que recibe por parametros todos los atributos
	public Persona (String n, String sn, char s, int yB,String c) {
		this.name = n;
		this.surname = sn;
		this.sex = s;
		this.yearBirth = yB;
		this.city = c;
	}
		
	// Constructor que recibe por parametros solo el nombre y apellido(s)
	public Persona (String n, String sn) {
		this.name = n;
		this.surname = sn;
	}
	
	// Constructor que recibe por parámetros solo el nombre, apellido(s), y año de nacimiento
	public Persona (String n, String sn, int yB) {
		this.name = n;
		this.surname = sn;
		this.yearBirth = yB;
	}
	
	// Comprobar si es mayor de edad

	// Métodos set y get. Dan la posibilidad de modificar y obtener datos del objeto creado. En este caos una persona.
	
	// Get
	public String getName() {
		return this.name;
	}
	public int getYB() {
		return this.yearBirth;
	}
	
	// Set
	public void setName(String n) {
		this.name = n;
	}
	public void setYB(int yB) {
		this.yearBirth = yB;
	}
	
	// Comprobar si es mayor de edad
	public void more18() {
		int age = this.getYB();
		if (LocalDate.now().getYear() - age > 17) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("Es menor de edad");
		}	
	}	
}
