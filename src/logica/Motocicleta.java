package logica;

public class Motocicleta extends Vehiculo {

	public Motocicleta(double cilindraje, double peso, double tamanioTanque) {
		super(cilindraje, peso, tamanioTanque);
		this.calculateAutonomia();
	}

	@Override
	public double calculateAutonomia() {
		return (8*Math.pow(10, 4)) / (this.cilindraje + (2*this.peso)) * this.tamanioTanque;
	}
	
}
