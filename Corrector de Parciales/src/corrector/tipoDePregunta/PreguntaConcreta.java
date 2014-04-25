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

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getRespuestaDelAlumno() {
        return respuestaDelAlumno;
    }

    public void setRespuestaDelAlumno(String respuestaDelAlumno) {
        this.respuestaDelAlumno = respuestaDelAlumno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
