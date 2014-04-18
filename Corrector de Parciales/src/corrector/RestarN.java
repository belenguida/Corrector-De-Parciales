/**
 * 
 */
package corrector;

/**
 * @author Belén
 *
 */
public class RestarN implements MetodoDeCorreccion {
	
	int valorN;

	public void corregirExamen(Examen examen) {
		// TODO Auto-generated method stub
		examen.actualizarNota(examen.puntajeObtenido() - this.valorN);	
		
	}

}
