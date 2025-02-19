package UI;

import logica.Automovil;
import logica.Motocicleta;
import logica.Vehiculo;

public class Main {
	
	public Main() {
		Vehiculo vehicle;
		
		vehicle = new Automovil(100, 80, 10);
		System.out.println(vehicle.calculateAutonomia());
		
		vehicle = new Motocicleta(50, 30, 5);
		System.out.println(vehicle.calculateAutonomia());
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
