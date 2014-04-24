/**
 * 
 */
package corrector.interfaces;

/**
 * @author Belén
 *
 */
public interface TipoDePregunta {

    public Integer puntosObtenidos();
    public Boolean esLaRespuestaCorrecta(String respuestaDelAlumno);
// Begin MOD Gabriel Arce
    public void titulo(String titulo);
// End MOD Gabriel Arce    
	

}
