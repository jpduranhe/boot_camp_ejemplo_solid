package solid.correcion.implementacion_o_correcta;

import static solid.correcion.ConstantesPrograma.DESCUENTO10PORCIENTO;
import static solid.correcion.ConstantesPrograma.DESCUENTO20PORCIENTO;
import static solid.correcion.ConstantesPrograma.DESCUENTO30PORCIENTO;
import static solid.correcion.ConstantesPrograma.IVA;

import solid.Libro;
import solid.correcion.DbLibro;
import solid.correcion.Factura;
import solid.correcion.implementacion_o_correcta.impresion.FacturaImpresionLaser;
import solid.correcion.implementacion_o_correcta.persistencia.FacturaPersistenciaMysql;

public class Runner {
	
	public static void main(String[] args) {
		
		DbLibro objDbLibro= new DbLibro();
		Libro[] listadoLibrosDisponibles=objDbLibro.librosDispobibles();
		Libro harryPotterI=listadoLibrosDisponibles[0];
		Libro harryPotterII=listadoLibrosDisponibles[1];
		Libro harryPotterIII=listadoLibrosDisponibles[2];
		
		facturar(harryPotterI,2,DESCUENTO10PORCIENTO);
		facturar(harryPotterII,1,DESCUENTO20PORCIENTO);
		facturar(harryPotterIII,3,DESCUENTO30PORCIENTO);

	}
	
	
	private static void facturar(Libro libro,int cantidad,double descuento) {
		
		
		Factura factura = new Factura(libro,cantidad,descuento,IVA);
		
		FacturaImpresionLaser facturaImpresion = new FacturaImpresionLaser(factura);
		FacturaPersistenciaMysql facturaPersistencia =  new FacturaPersistenciaMysql();
		facturaImpresion.imprimir();
		
		facturaPersistencia.guardar(factura);
	}
	
	

}
