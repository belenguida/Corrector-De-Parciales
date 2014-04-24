/**
 * 
 */
package corrector.tipoDePregunta;


import corrector.interfaces.TipoDePregunta;

/**
 * Created by ASUS.
 * @author Ignacio Doring
 */
public class VerdaderoOFalso implements TipoDePregunta {

    private Integer peso;
    private String respuestaCorrecta;
    private String respuestaDelAlumno;

    @SuppressWarnings("unused")
	private String titulo;
    
    @Override
    public Integer puntosObtenidos(){
		
		if(esLaRespuestaCorrecta(this.respuestaDelAlumno)){
            return this.peso;
        }
		return 0;
	}

    @Override
    public Boolean esLaRespuestaCorrecta(String respuestaDelAlumno) {
        return respuestaDelAlumno.equalsIgnoreCase(respuestaCorrecta)||
               respuestaDelAlumno.equalsIgnoreCase(respuestaCorrecta.substring(0,1));

    }

    //Begin MOD - Gabriel Arce
	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
    //End MOD - Gabriel Arce

	@Override
	public void titulo(String titulo) {
		this.titulo = titulo;
	}



	
}
