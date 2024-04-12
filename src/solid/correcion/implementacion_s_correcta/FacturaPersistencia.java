package solid.correcion.implementacion_s_correcta;

import solid.correcion.Factura;

public class FacturaPersistencia {
	Factura factura;

    public FacturaPersistencia(Factura factura) {
        this.factura = factura;
    }

    public void guardarArchivo(String nombreArchivo) {
    	System.out.println("Crea un archivo con el nombre "+nombreArchivo+".txt.") ;
    }
}
