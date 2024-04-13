package solid.correcion.implementacion_l;

import static solid.correcion.ConstantesPrograma.DESCUENTO_10_PORCIENTO;
import static solid.correcion.ConstantesPrograma.DESCUENTO_20_PORCIENTO;
import static solid.correcion.ConstantesPrograma.DESCUENTO_30_PORCIENTO;
import static solid.correcion.ConstantesPrograma.IVA;

import solid.Libro;
import solid.correcion.DbLibro;
import solid.correcion.Factura;
import solid.correcion.implementacion_o.impresion.FacturaImpresionConsola;
import solid.correcion.implementacion_o.impresion.FacturaImpresionLaser;
import solid.correcion.implementacion_o.impresion.ImprimeFactura;
import solid.correcion.implementacion_o.persistencia.FacturaPersistenciaArchivo;
import solid.correcion.implementacion_o.persistencia.FacturaPersistenciaMysql;
import solid.correcion.implementacion_o.persistencia.PersistirFactura;

public class Runner {
	
	
	private static ImprimeFactura imprimeFactura;
	private static PersistirFactura persistirFactura;
	
	public static void main(String[] args) {
		
		DbLibro objDbLibro= new DbLibro();
		Libro[] listadoLibrosDisponibles=objDbLibro.librosDispobibles();
		Libro harryPotterI=listadoLibrosDisponibles[0];
		Libro harryPotterII=listadoLibrosDisponibles[1];
		Libro harryPotterIII=listadoLibrosDisponibles[2];		
		
		persistirFactura =  new FacturaPersistenciaArchivo();
		
		facturar(harryPotterI,2,DESCUENTO_10_PORCIENTO);
		facturar(harryPotterII,1,DESCUENTO_20_PORCIENTO);
		facturar(harryPotterIII,3,DESCUENTO_30_PORCIENTO);

	}	
	
	private static void facturar(Libro libro,int cantidad,double descuento) {		
		
		Factura factura = new Factura(libro,cantidad,descuento,IVA);		
		imprimeFactura = new FacturaImpresionConsola(factura);
		imprimir(factura);
		
		persistir(factura);
	}
	private static void imprimir(Factura factura) {
		imprimeFactura.imprimir();
	}
	private static void persistir(Factura factura) {
		persistirFactura.guardar(factura);
	}
	

}
