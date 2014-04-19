/**
 * 
 */
package corrector;

import corrector.interfaces.MetodoDeCorreccion;

import java.util.List;

/**
 * @author Belén
 * @author Ignacio Doring
 *
 */
public class Profesor {

    private MetodoDeCorreccion metodo;
    private List<Examen> examenes;
	
	public void corregirExamenes(){
		this.getExamenes().stream().forEach(examen -> examen.actualizarNota(this.metodo.corregirExamen(examen)));
			
	}
	
	public List<Examen> getExamenes(){
        return this.examenes;
	}

}
