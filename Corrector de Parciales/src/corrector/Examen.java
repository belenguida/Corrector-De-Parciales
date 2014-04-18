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
	
	float nota;
	float puntajeTotal;
	List<Pregunta> preguntas;
		
	@SuppressWarnings("rawtypes")
	public float puntajeObtenido() {
		// TODO Auto-generated method stub
		/*float puntaje = preguntas.stream().map(Pregunta::puntajePorPregunta).collect(Collectors.toList()).sum();
		*/
		return 0;
	}
	
	public float puntajePorPregunta(Pregunta pregunta){
		
		return 0;
	}

	public void actualizarNota(float nota) {
		// TODO Auto-generated method stub
		
	}

}
