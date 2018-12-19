package DescargaPractica;

import java.util.Collection;

public class Pelicula extends Fichero {

	
	//ATRIBUTOS
	String titulo;
	Director director;
	Collection<Actor> actoresPrincipales;
	
	
	
	
	//METODOS
	
	@Override
	public String getTitulo() {
		
		return titulo;
	}


	Director getDirector() {
		return director;
	}


	Collection<Actor> getActoresPrincipales() {
		return actoresPrincipales;
	}

	//CONSTRUCTOR
	
	public Pelicula(int id, double tamano) {
		super(id, tamano);
	}
	
	
}
