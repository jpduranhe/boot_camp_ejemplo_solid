package solid.correcion.implementacion_o_correcta.impresion;

import solid.correcion.Factura;

public class FacturaImpresionLaser extends ImprimeFactura {



    public FacturaImpresionLaser(Factura factura) {
        super(factura) ;
    }
	
	@Override
	public void imprimir() {
		System.out.println("Imprsion Laser "+factura.getLibro().getNombre());
		
	}

}
