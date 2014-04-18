/**
 * 
 */
package corrector;

/**
 * @author Belén 	
 *
 */
public class Pregunta {
	
	float peso;
	String respuestaCorrecta;
	String respuestaAlumno;
	TipoDePregunta tipo;
	
	public float puntosObtenidos(){
		
		if(this.respuestaAlumno.equals(this.respuestaCorrecta))
		return this.peso;
		else		
		return 0;
	}
	
}
