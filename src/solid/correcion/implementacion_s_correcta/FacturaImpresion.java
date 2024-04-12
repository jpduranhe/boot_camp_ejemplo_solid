package solid.correcion.implementacion_s_correcta;

import solid.Libro;
import solid.correcion.Factura;

public class FacturaImpresion {
	 private Factura factura;

	    public FacturaImpresion(Factura factura) {
	        this.factura = factura;
	    }

	    public void imprimir() {
	    	
	    	Libro libro=factura.getLibro();
	    	System.out.println("------------ INICIO FACTURA----------");
	        System.out.println(factura.getCantidad() + "x " + libro.getNombre() + " $" + libro.getPrecio() );
	        System.out.println("Tasa de Descuento: " + factura.getTasaDescuento());
	        System.out.println("Tasa de Impuesto: " + factura.getTasaImpuesto());
	        System.out.println("Total: " + factura.getTotal() + " $");
	        System.out.println("------------ FIN FACTURA-------------");
	    }
}
