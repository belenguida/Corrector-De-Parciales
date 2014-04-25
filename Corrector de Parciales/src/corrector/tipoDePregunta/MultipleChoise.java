package corrector.tipoDePregunta;

import corrector.interfaces.TipoDePregunta;

/**
 * Created by ASUS.
 * @author Ignacio Doring
 */
public class MultipleChoise implements TipoDePregunta {

    private Integer peso;
    private Integer respuestaCorrecta;
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
        return respuestaCorrecta == Integer.valueOf(respuestaDelAlumno);
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getRespuestaDelAlumno() {
        return respuestaDelAlumno;
    }

    public void setRespuestaDelAlumno(String respuestaDelAlumno) {
        this.respuestaDelAlumno = respuestaDelAlumno;
    }

    public Integer getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(Integer respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
