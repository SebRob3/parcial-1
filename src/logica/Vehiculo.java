package logica;

public abstract class Vehiculo {
	//No se si el cilindraje, peso y tamaño del tanque pueden ser decimales entonces las puse todas en double.
	protected double cilindraje; //en cm^3
	protected double peso; //en kg
	protected double tamanioTanque; //en galones
	
	public Vehiculo(double cilindraje, double peso, double tamanioTanque) {
		super();
		this.cilindraje = cilindraje;
		this.peso = peso;
		this.tamanioTanque = tamanioTanque;
	}
	
	public double getCilindraje() {
		return this.cilindraje;
	}
	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTamanioTanque() {
		return this.tamanioTanque;
	}
	public void setTamanioTanque(double tamanioTanque) {
		this.tamanioTanque = tamanioTanque;
	}
	
	public abstract double calculateAutonomia();
}
