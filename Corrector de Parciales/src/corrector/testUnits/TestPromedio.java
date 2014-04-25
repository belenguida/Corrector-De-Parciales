package corrector.testUnits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import corrector.Examen;
import corrector.interfaces.MetodoDeCorreccion;
import corrector.interfaces.TipoDePregunta;
import corrector.metodoDeCorreccion.NotaPromedioDeConjuntoDeCriterios;
import corrector.metodoDeCorreccion.ReglaDe3Simple;
import corrector.metodoDeCorreccion.RestarN;
import corrector.tipoDePregunta.VerdaderoOFalso;

public class TestPromedio {

	static String FALSO = "F";
	static String VERDADERO = "V";	
	
	VerdaderoOFalso preguntaVoF1 = new VerdaderoOFalso();
	VerdaderoOFalso preguntaVoF2 = new VerdaderoOFalso();
	
	List<TipoDePregunta> preguntas = new ArrayList<TipoDePregunta>();
	
	Examen examen = new Examen();
	
	ReglaDe3Simple reglaDe3Simple = new ReglaDe3Simple();
	RestarN restarN = new RestarN();
	
	NotaPromedioDeConjuntoDeCriterios notaPromedio = new NotaPromedioDeConjuntoDeCriterios();
	
	List<MetodoDeCorreccion> conjuntoDeCriterios = new ArrayList<MetodoDeCorreccion>();
	
	@Before
	public void setUp() throws Exception {
        preguntaVoF1.setTitulo("El Zonda es el nombre de un huracan que se encuentra en la zona cuyana de la Argentina");
        preguntaVoF1.setRespuestaCorrecta(FALSO);
        preguntaVoF1.setRespuestaDelAlumno(FALSO);
        preguntaVoF1.setPeso(5);
        preguntaVoF2.setTitulo("San Martin y Simon Bolivar se encontraron en la ciudad de Guayaquil");
        preguntaVoF2.setRespuestaCorrecta(VERDADERO);
        preguntaVoF2.setRespuestaDelAlumno(FALSO);
        preguntaVoF2.setPeso(5);
		
		preguntas.add(preguntaVoF1);
		preguntas.add(preguntaVoF2);
		
		examen.setPreguntas(preguntas);
        examen.setPuntajeTotal(10.0);
		
		restarN.setValorN(2);

		conjuntoDeCriterios.add(restarN);
		conjuntoDeCriterios.add(reglaDe3Simple);
        notaPromedio.setConjuntoDeCriterios(conjuntoDeCriterios);
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

		assertEquals(4.0, notaPromedio.corregirExamen(examen), 4.0);
		
	}	

}
