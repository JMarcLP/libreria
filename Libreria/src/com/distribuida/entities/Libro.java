package com.distribuida.entities;
import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class Libro {
	
	//atributos
	private int idLibro;
	private String titutlo;
	private String editorial;
	private int numPaginas;
	private String edicion;
	private String idioma;
	private Date fechaPublicacion;
	private String descripcion;
	private String tipoPasta;
	private String isbn;
	private String numEjemplares;
	private String portada;
	private String presentacion;
	private double precio;
	private Autor autor;
	private Categoria categoria;
	

	
}
