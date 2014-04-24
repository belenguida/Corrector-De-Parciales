package corrector.tipoDePregunta;

import corrector.interfaces.TipoDePregunta;

/**
 * Created by ASUS.
 * @author Ignacio Doring
 */
public class PreguntaConcreta implements TipoDePregunta {

    private Integer peso;
    private String respuestaCorrecta;
    private String respuestaDelAlumno;
    
    @SuppressWarnings("unused")
	private String titulo;

    @Override
    public Integer puntosObtenidos() {
        if(esLaRespuestaCorrecta(this.respuestaDelAlumno)){
            return this.peso;
        }
        return 0;
    }

    @Override
    public Boolean esLaRespuestaCorrecta(String respuestaDelAlumno) {
        return respuestaDelAlumno.equalsIgnoreCase(respuestaCorrecta);
    }

	@Override
	public void titulo(String titulo) {
		this.titulo = titulo;
		
	}
}
