package solid.correcion.implementacion_o_correcta.persistencia;

import solid.correcion.Factura;

public class FacturaPersistenciaMysql implements PersistirFactura{

	@Override
	public void guardar(Factura factura) {
		System.out.println("Factura guardad en mysql") ;
		
	}

}
