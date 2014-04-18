/**
 * 
 */
package corrector;

/**
 * @author Belén
 *
 */
public class ReglaDe3Simple implements MetodoDeCorreccion {

	public void corregirExamen(Examen examen) {
		// TODO Auto-generated method stub
		examen.actualizarNota(this.aplicarReglaDe3Simple(examen));	
	}
	
	public float aplicarReglaDe3Simple(Examen examen){
		return examen.puntajeObtenido() * 10 / examen.puntajeTotal;
		
	}

}
