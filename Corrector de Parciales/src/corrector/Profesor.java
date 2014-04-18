/**
 * 
 */
package corrector;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Belén
 *
 */
public class Profesor {

	MetodoDeCorreccion metodo;
	List<Examen> examenes;
	
	public void corregirExamenes(){
		this.getExamenes().stream().forEach(examen -> this.metodo.corregirExamen(examen));
			
	}
	
	public List<Examen> getExamenes(){
		return this.examenes;
	}
}
