package DescargaPractica;

public interface Identificable extends Comparable<Identificable>{

	int getId();
	
	@Override
	default int compareTo (Identificable elOtro) {
		
		return getId() - elOtro.getId();
	}
	//al poner "default" no es necesario implementar el metodo en las clases.
	//con esto obtiene un valor que luego utiliza para ordenarlo. 
}
