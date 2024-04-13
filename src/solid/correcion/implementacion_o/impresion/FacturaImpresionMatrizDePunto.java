package solid.correcion.implementacion_o.impresion;

import solid.correcion.Factura;

public class FacturaImpresionMatrizDePunto extends ImprimeFactura {

	public FacturaImpresionMatrizDePunto(Factura factura) {
        super(factura) ;
    }
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Imprsion Matriz de punto "+factura.getLibro().getNombre());
	}

}
