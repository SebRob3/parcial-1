package UI;

import logica.Automovil;
import logica.Motocicleta;
import logica.Vehiculo;

public class Main {
	
	public Main() {
		Vehiculo vehicle;
		
		vehicle = new Automovil(2000, 1619, 15);
		System.out.println("Peso: " + vehicle.getPeso ());
		System.out.println("Tamaño tanque: " + vehicle.getTamanioTanque());
		System.out.println("Cilindraje: " + vehicle.getCilindraje());
		System.out.println("Autonomia: " + vehicle.calculateAutonomia());
		
		vehicle = new Motocicleta(1043, 200, 3);
		System.out.println("Peso: " + vehicle.getPeso ());
		System.out.println("Tamaño tanque: " + vehicle.getTamanioTanque());
		System.out.println("Cilindraje: " + vehicle.getCilindraje());
		System.out.println("Autonomia: " + vehicle.calculateAutonomia());
		
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
