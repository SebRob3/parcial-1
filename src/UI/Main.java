package UI;

import logica.Automovil;
import logica.Motocicleta;
import logica.Vehiculo;

public class Main {
	
	public Main() {
		Vehiculo vehicle;
		
		vehicle = new Automovil(2000, 1619, 15);
		System.out.println(vehicle.calculateAutonomia());
		
		vehicle = new Motocicleta(1043, 200, 3);
		System.out.println(vehicle.calculateAutonomia());
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
