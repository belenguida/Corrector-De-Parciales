package corrector.testUnits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import corrector.Examen;
import corrector.interfaces.TipoDePregunta;
import corrector.metodoDeCorreccion.ReglaDe3Simple;
import corrector.tipoDePregunta.VerdaderoOFalso;

public class TestReglaDe3Simple {

	static String FALSO = "F";
	static String VERDADERO = "V";	
	
	VerdaderoOFalso preguntaVoF1 = new VerdaderoOFalso();
	VerdaderoOFalso preguntaVoF2 = new VerdaderoOFalso();
	
	List<TipoDePregunta> preguntas = new ArrayList<TipoDePregunta>();
	
	Examen examen = new Examen();
	
	ReglaDe3Simple reglaDe3Simple = new ReglaDe3Simple();
	

	@Before
	public void setUp() throws Exception {
		preguntaVoF1.titulo("El Zonda es el nombre de un huracan que se encuentra en la zona cuyana de la Argentina");
		preguntaVoF1.setRespuestaCorrecta(FALSO);
		preguntaVoF2.titulo("San Martin y Simon Bolivar se encontraron en la ciudad de Guayaquil");
		preguntaVoF2.setRespuestaCorrecta(VERDADERO);
		
		preguntas.add(preguntaVoF1);
		preguntas.add(preguntaVoF2);
		
		examen.setPreguntas(preguntas);
		
		
	}

	@Test
	public void testExamenTienePreguntas(){
		assertNotEquals("El examen no tiene preguntas", 0, examen.getPreguntas().size());
	}
	

	@Test
	public void testElResultadoDeCorrecionEs5(){
		reglaDe3Simple.aplicarReglaDe3Simple(examen);
		assertEquals(5.0, reglaDe3Simple.corregirExamen(examen), 5.0);
	}
	

}
