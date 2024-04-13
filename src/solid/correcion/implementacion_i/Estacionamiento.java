package solid.correcion.implementacion_i;

public interface Estacionamiento {

	void aparcarCoche();
	void sacarCoche();
	void getCapacidad();
	double calcularTarifa(double horas);
	void hacerPago(double monto);
}
