package DescargaPractica;

import EjecucionDescargaPractica.IdenDescagable;

public abstract class Fichero implements IdenDescagable {

	//ATRIBUTOS
	
	int id;
	double tamano;
//	String titulo; Lo dejamos comnetado para practicar que sea abstracto.
	
	//GETTERS
	
	@Override
	public double getTamano() {
		return tamano;
	}

	@Override
	public int getId() {
		return id;
	}

//	String getTitulo() {
//		return titulo;
//	}

	public abstract String getTitulo();
	
	//CONSTRUCTOR
	
	public Fichero(int id, double tamano) {
		super();
		this.id = id;
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Fichero [id=" + id + ", tamano=" + tamano + "]";
	}
	
	
	
}
