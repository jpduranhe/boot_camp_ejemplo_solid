package solid.correcion.implementacion_l;

import static solid.correcion.ConstantesPrograma.DESCUENTO_10_PORCIENTO;
import static solid.correcion.ConstantesPrograma.DESCUENTO_20_PORCIENTO;
import static solid.correcion.ConstantesPrograma.DESCUENTO_30_PORCIENTO;
import static solid.correcion.ConstantesPrograma.IVA;

import solid.Libro;
import solid.correcion.DbLibro;
import solid.correcion.Factura;
import solid.correcion.implementacion_o.impresion.FacturaImpresionLaser;
import solid.correcion.implementacion_o.persistencia.FacturaPersistenciaMysql;

public class Runner {
	
	public static void main(String[] args) {
		
		DbLibro objDbLibro= new DbLibro();
		Libro[] listadoLibrosDisponibles=objDbLibro.librosDispobibles();
		Libro harryPotterI=listadoLibrosDisponibles[0];
		Libro harryPotterII=listadoLibrosDisponibles[1];
		Libro harryPotterIII=listadoLibrosDisponibles[2];
		
		facturar(harryPotterI,2,DESCUENTO_10_PORCIENTO);
		facturar(harryPotterII,1,DESCUENTO_20_PORCIENTO);
		facturar(harryPotterIII,3,DESCUENTO_30_PORCIENTO);

	}
	
	
	private static void facturar(Libro libro,int cantidad,double descuento) {
		
		
		Factura factura = new Factura(libro,cantidad,descuento,IVA);
		
		FacturaImpresionLaser facturaImpresion = new FacturaImpresionLaser(factura);
		FacturaPersistenciaMysql facturaPersistencia =  new FacturaPersistenciaMysql();
		facturaImpresion.imprimir();
		
		facturaPersistencia.guardar(factura);
	}
	
	

}
