/**
 * 
 */
package corrector;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Belén 
 *
 */
public class Examen {
	
	double nota;
	double puntajeTotal;
	List<Pregunta> preguntas;
		
	@SuppressWarnings("rawtypes")
	public double puntajeObtenido() {
		// TODO Auto-generated method stub
		return preguntas.stream().mapToDouble((p) -> p.puntosObtenidos()).sum();
		
	}

	
	public void actualizarNota(double nota) {
		// TODO Auto-generated method stub
		
	}

}
