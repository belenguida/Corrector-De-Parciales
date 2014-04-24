package corrector.testUnits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import corrector.Examen;
import corrector.interfaces.MetodoDeCorreccion;
import corrector.interfaces.TipoDePregunta;
import corrector.metodoDeCorreccion.NotaMasAltaDeConjuntoDeCriterios;
import corrector.metodoDeCorreccion.ReglaDe3Simple;
import corrector.metodoDeCorreccion.RestarN;
import corrector.tipoDePregunta.VerdaderoOFalso;

public class TestNotaMasAlta {

	static String FALSO = "F";
	static String VERDADERO = "V";	
	
	VerdaderoOFalso preguntaVoF1 = new VerdaderoOFalso();
	VerdaderoOFalso preguntaVoF2 = new VerdaderoOFalso();
	
	List<TipoDePregunta> preguntas = new ArrayList<TipoDePregunta>();
	
	Examen examen = new Examen();
	
	ReglaDe3Simple reglaDe3Simple = new ReglaDe3Simple();
	RestarN restarN = new RestarN();
	NotaMasAltaDeConjuntoDeCriterios notaMasAlta = new NotaMasAltaDeConjuntoDeCriterios();
	
	List<MetodoDeCorreccion> conjuntoDeCriterios = new ArrayList<MetodoDeCorreccion>();
	
	@Before
	public void setUp() throws Exception {
		preguntaVoF1.titulo("El Zonda es el nombre de un huracan que se encuentra en la zona cuyana de la Argentina");
		preguntaVoF1.setRespuestaCorrecta(FALSO);
		preguntaVoF2.titulo("San Martin y Simon Bolivar se encontraron en la ciudad de Guayaquil");
		preguntaVoF2.setRespuestaCorrecta(VERDADERO);
		
		preguntas.add(preguntaVoF1);
		preguntas.add(preguntaVoF2);
		
		examen.setPreguntas(preguntas);
		
		reglaDe3Simple.corregirExamen(examen);
		
		restarN.setValorN(4);
		restarN.corregirExamen(examen);

		conjuntoDeCriterios.add(restarN);
		conjuntoDeCriterios.add(reglaDe3Simple);
		
	}

	@Test
	public void testExamenTienePreguntas(){
		assertNotEquals("El examen no tiene preguntas", 0, examen.getPreguntas().size());
	}
	
	@Test
	public void testExistenCriterios(){
		assertNotEquals("No hay criterios", 0, conjuntoDeCriterios.size());
	}
	
	
	@Test
	public void testElResultadoDeCorreccionEs4(){
		restarN.corregirExamen(examen);
		reglaDe3Simple.corregirExamen(examen);

		notaMasAlta.setConjuntoDeCriterios(conjuntoDeCriterios);
		
		assertEquals(4, notaMasAlta.corregirExamen(examen), 4);
		
	}

}
