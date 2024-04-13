package solid.correcion.implementacion_o.persistencia;

import solid.correcion.Factura;

public class FacturaPersistenciaArchivo  implements PersistirFactura{

	public void guardar(Factura factura) {
		System.out.println("Crea un archivo con el nombre "+factura.getLibro().getNombre()+".txt") ;
	}
}
