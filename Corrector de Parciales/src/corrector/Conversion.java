/**
 * 
 */
package corrector;

/**
 * @author Belén
 *
 */
public class Conversion implements MetodoDeCorreccion {

	float coeficienteDeConversion;
	
	public void corregirExamen(Examen examen) {
		// TODO Auto-generated method stub
		examen.actualizarNota(this.aplicarConversion(examen.puntajeObtenido()));	
	}

	private double aplicarConversion(double puntajeObtenido) {
		// TODO Auto-generated method stub
		return puntajeObtenido * this.coeficienteDeConversion;
	}

}
