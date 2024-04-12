package solid;

public class Libro {
	
	private String nombre;
	private String nombreAutor;
	private int anio;
	private int precio;
	private String isbn;

	public Libro(String nombre, String nombreAutor, int anio, int precio, String isbn) {
		this.nombre = nombre;
		this.nombreAutor = nombreAutor;
		this.anio = anio;
		this.precio = precio;
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anyo) {
		this.anio = anyo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}
