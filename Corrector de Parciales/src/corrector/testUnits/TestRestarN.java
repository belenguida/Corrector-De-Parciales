package corrector.testUnits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import corrector.Examen;
import corrector.interfaces.TipoDePregunta;
import corrector.metodoDeCorreccion.RestarN;
import corrector.tipoDePregunta.VerdaderoOFalso;

public class TestRestarN {

	static String FALSO = "F";
	static String VERDADERO = "V";	
	
	VerdaderoOFalso preguntaVoF1 = new VerdaderoOFalso();
	VerdaderoOFalso preguntaVoF2 = new VerdaderoOFalso();
	
	List<TipoDePregunta> preguntas = new ArrayList<TipoDePregunta>();
	
	Examen examen = new Examen();
	
	RestarN restar = new RestarN();
	
	@Before
	public void setUp() throws Exception {
        preguntaVoF1.setTitulo("El Zonda es el nombre de un huracan que se encuentra en la zona cuyana de la Argentina");
        preguntaVoF1.setRespuestaCorrecta(FALSO);
        preguntaVoF1.setRespuestaDelAlumno(FALSO);
        preguntaVoF1.setPeso(9);
        preguntaVoF2.setTitulo("San Martin y Simon Bolivar se encontraron en la ciudad de Guayaquil");
        preguntaVoF2.setRespuestaCorrecta(VERDADERO);
        preguntaVoF2.setRespuestaDelAlumno(VERDADERO);
        preguntaVoF2.setPeso(5);
		
		preguntas.add(preguntaVoF1);
		preguntas.add(preguntaVoF2);
		
		examen.setPreguntas(preguntas);	
		
		restar.setValorN(4);
		
	}

	@Test
	public void testExamenTienePreguntas(){
		assertNotEquals("El examen no tiene preguntas", 0, examen.getPreguntas().size());
	}
	

	@Test
	public void testElResultadoDeCorrecionEs10(){
		assertEquals(10.0, restar.corregirExamen(examen), 10.0);
	}

}
