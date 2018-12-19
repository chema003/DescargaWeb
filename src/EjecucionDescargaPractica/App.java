package EjecucionDescargaPractica;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import DescargaPractica.Conexion;
import DescargaPractica.Descargable;
import DescargaPractica.Identificable;
import DescargaPractica.Musica;
import DescargaPractica.Pelicula;

import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		
		Collection<IdenDescagable> listaDescargas = new ArrayList<>();
		
		listaDescargas.add(new Musica(2, 240));
		listaDescargas.add(new Pelicula(1, 980.3));
		listaDescargas = (ordenarDescargas(listaDescargas));
		System.out.println(construirInforme(listaDescargas));
		
	}
	
	
	
	private static double calcularTamanoTotal (Collection<Descargable> descarga) {
		double total = 0;
		
		for (Descargable descargable : descarga) {
			total += descargable.getTamano();
			}
		return total;
	}
	
	/**
	 * @param descarga
	 * @param conexion
	 * @return segundos que se tarda en descargar con la velocidad de la conexion.
	 */
	private static double calcularTiempoDescarga (Collection<Descargable> descarga, Conexion conexion) {
		return calcularTamanoTotal(descarga)/conexion.getVelocidad();
		
	}

	private static <T extends Identificable> Collection<T> ordenarDescargas (Collection<T> descargas) {
		//clases genericas. T es un tipo generico y se limita a que implemente Identificable. 
		//puede ponerse interfaces o clases.
		//lo que meta por parametro me lo devuleve del mismo tipo (T). 
		
		List<T> listaOrdenada = new ArrayList<>(descargas);
		listaOrdenada.sort(null);
		
		return null;
	}
	
	private static String construirInforme (Collection<IdenDescagable> descargas) {
		
		String informe = "Lista de descargas:";
		for (IdenDescagable idenDescagable : descargas) {
			informe += "\n" + idenDescagable;
		}
		return informe;
	}
}
