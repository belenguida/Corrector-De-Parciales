package corrector.testUnits;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

import corrector.Alumno;
import corrector.Examen;
import corrector.Profesor;
import corrector.interfaces.TipoDePregunta;
import corrector.tipoDePregunta.*;

public class TiposDeRespuestaTest {

	VerdaderoOFalso preguntaVoF = new VerdaderoOFalso();
	Examen examen = new Examen();
	Profesor profesor = new Profesor();
	Alumno alumno = new Alumno();
	
	protected List<TipoDePregunta> preguntas;
	
	static final String FALSO = "F";
	static final String VERDADERO = "V";
	
	@Before
	public void setUp() throws Exception {
	
		preguntaVoF.setRespuestaCorrecta(VERDADERO);
		
	}

//	@Test
//	public void testTieneRespuesta(){
	//	assertTrue("No tiene respuesta", preguntaVoF.esLaRespuestaCorrecta(null));
//	}
	
	@Test
	public void testRespuestaEsVerdadero(){
		assertTrue("Respuesta incorrecta", preguntaVoF.esLaRespuestaCorrecta(VERDADERO));
	}



}
