package corrector.testUnits;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corrector.tipoDePregunta.*;

public class TestTiposDeRespuesta {

	VerdaderoOFalso preguntaVoF = new VerdaderoOFalso();
	
	static final String FALSO = "F";
	static final String VERDADERO = "V";	
	
	String respuestaDelAlumno = VERDADERO;
	
	@Before
	public void setUp() throws Exception {
		preguntaVoF.setRespuestaCorrecta(VERDADERO);
	}

	@Test
	public void testTieneRespuesta(){
		assertNotNull("No tiene Respuesta", preguntaVoF.esLaRespuestaCorrecta(respuestaDelAlumno));
	}
	
	@Test
	public void testRespuestaEsVerdadero(){
		assertTrue("Respuesta incorrecta", preguntaVoF.esLaRespuestaCorrecta(respuestaDelAlumno));
	}



}
