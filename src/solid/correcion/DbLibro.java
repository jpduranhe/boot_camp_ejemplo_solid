package solid.correcion;

import solid.Libro;

public class DbLibro {
	
	
	
	public Libro[] librosDispobibles(){
		
		Libro[] listadoLibros= new Libro[3];
		
		listadoLibros[0]= new Libro("Harry Potter y la piedra Filosofal",
				"J.K.Rolling",
				1999,
				16000,
				"13:9788478884452");
		listadoLibros[1]= new Libro("Harry Potter y la cámara secretal",
				"J.K.Rolling",
				1999,
				18000,
				"13:9788478884957");
		listadoLibros[2]= new Libro("Harry Potter y el prisionero de Azkaban",
				"J.K.Rolling",
				1999,
				17000,
				"13: 9788478885190");
		
		return listadoLibros;
	}

}
