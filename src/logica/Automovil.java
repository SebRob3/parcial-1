package logica;

public class Automovil extends Vehiculo {

	public Automovil(double cilindraje, double peso, double tamanioTanque) {
		super(cilindraje, peso, tamanioTanque);
	}

	@Override
	public double calculateAutonomia() {
		return (15*Math.pow(10, 4))/((this.cilindraje + this.peso)) * (this.tamanioTanque);
	}

}
