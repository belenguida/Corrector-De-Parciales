package corrector;

import corrector.interfaces.TipoDePregunta;

import java.util.List;

/**
 * @author Belén
 * @author Ignacio Doring
 *
 */
public class Examen {
	
	private Double nota;
	private Double puntajeTotal;

	@SuppressWarnings("unused")
	private Alumno alumno;
	
	private List<TipoDePregunta> preguntas;
		
	public Integer puntajeObtenido() {
        return preguntas.stream().mapToInt(p -> p.puntosObtenidos()).sum();

		
	}

	
	public void actualizarNota(double nota) {

		this.nota = nota;
	}


    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(Double puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public List<TipoDePregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<TipoDePregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
