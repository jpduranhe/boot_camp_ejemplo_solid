package solid.correcion.implementacion_o.impresion;

import solid.correcion.Factura;

public abstract class ImprimeFactura {
	
	protected Factura factura;
	
    public ImprimeFactura(Factura factura) {
        this.factura = factura;
    }
	

	public  abstract void imprimir();
	
	
	
}
