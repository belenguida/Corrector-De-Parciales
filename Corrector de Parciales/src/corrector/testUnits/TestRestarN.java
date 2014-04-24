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
		preguntaVoF1.titulo("El Zonda es el nombre de un huracan que se encuentra en la zona cuyana de la Argentina");
		preguntaVoF1.setRespuestaCorrecta(FALSO);
		preguntaVoF2.titulo("San Martin y Simon Bolivar se encontraron en la ciudad de Guayaquil");
		preguntaVoF2.setRespuestaCorrecta(VERDADERO);
		
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
	public void testElResultadoDeCorrecionEs4(){
		assertEquals(4.0, restar.corregirExamen(examen), 4.0);
	}

}