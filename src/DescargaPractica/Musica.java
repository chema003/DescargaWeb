package DescargaPractica;

public class Musica extends Fichero {

	//ATRIBUTOS
	Cantante cantante;
	
	@Override
	public String getTitulo() {
		return null;
	}

	Cantante getCantante() {
		return cantante;
	}

	
	//CONSTRUCTORES

	
	public Musica(int id, double tamano) {
		super(id, tamano);
		
	}

	
	
	
}
