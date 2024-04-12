package solid.original;
import static solid.correcion.ConstantesPrograma.DESCUENTO10PORCIENTO;
import static solid.correcion.ConstantesPrograma.DESCUENTO20PORCIENTO;
import static solid.correcion.ConstantesPrograma.DESCUENTO30PORCIENTO;
import static solid.correcion.ConstantesPrograma.IVA;

import solid.Libro;
import solid.correcion.DbLibro;

public class Runner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DbLibro objDbLibro= new DbLibro();
		Libro[] listadoLibrosDisponibles=objDbLibro.librosDispobibles();
		Libro harryPotterI=listadoLibrosDisponibles[0];
		Libro harryPotterII=listadoLibrosDisponibles[1];
		Libro harryPotterIII=listadoLibrosDisponibles[2];
		
		facturar(harryPotterI,2,DESCUENTO10PORCIENTO);
		facturar(harryPotterII,1,DESCUENTO20PORCIENTO);
		facturar(harryPotterIII,3,DESCUENTO30PORCIENTO);
		facturar(harryPotterIII,3,0);
	}
	
	
	private static void facturar(Libro libro,int cantidad,double descuento) {
		Factura factura = new Factura(libro,1,descuento,IVA);
		factura.imprimeFactura();
		factura.guardarArchivo("Factura Libro:"+libro.getNombre());
	}
	
	

}
