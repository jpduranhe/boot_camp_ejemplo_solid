package solid.correcion.implementacion_o.impresion;

import solid.Libro;
import solid.correcion.Factura;

public class FacturaImpresionConsola extends ImprimeFactura {
	
    public FacturaImpresionConsola(Factura factura) {
    	super(factura) ;
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
