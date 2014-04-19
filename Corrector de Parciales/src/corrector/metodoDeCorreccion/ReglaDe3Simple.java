/**
 * 
 */
package corrector.metodoDeCorreccion;

import corrector.Examen;
import corrector.interfaces.MetodoDeCorreccion;

/**
 * @author Belén
 * @author Ignacio Döring
 *
 */
public class ReglaDe3Simple implements MetodoDeCorreccion {

    @Override
	public Double corregirExamen(Examen examen) {
		return this.aplicarReglaDe3Simple(examen);
    }
	
	public Double aplicarReglaDe3Simple(Examen examen){
		return examen.puntajeObtenido() * 10 / examen.getPuntajeTotal();
		
	}

}
