package corrector.testUnits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import corrector.Examen;
import corrector.interfaces.TipoDePregunta;
import corrector.metodoDeCorreccion.TablaDeConversion;
import corrector.tipoDePregunta.VerdaderoOFalso;

public class TestTablaDeConversion {

	static String FALSO = "F";
	static String VERDADERO = "V";	
	
	VerdaderoOFalso preguntaVoF1 = new VerdaderoOFalso();
	VerdaderoOFalso preguntaVoF2 = new VerdaderoOFalso();
	
	List<TipoDePregunta> preguntas = new ArrayList<TipoDePregunta>();
	
	Examen examen = new Examen();
	
	TablaDeConversion tablaConversion = new TablaDeConversion();
	Map<Integer,Double> tabla;
	
	@Before
	public void setUp() throws Exception {
		preguntaVoF1.titulo("El Zonda es el nombre de un huracan que se encuentra en la zona cuyana de la Argentina");
		preguntaVoF1.setRespuestaCorrecta(FALSO);
		preguntaVoF2.titulo("San Martin y Simon Bolivar se encontraron en la ciudad de Guayaquil");
		preguntaVoF2.setRespuestaCorrecta(VERDADERO);
		
		preguntas.add(preguntaVoF1);
		preguntas.add(preguntaVoF2);
		
		examen.setPreguntas(preguntas);		
		
		tabla.put(16, 10.0);
		tabla.put(15, 8.0);
		tabla.put(14, 6.0);
		tabla.put(13, 4.0);
		
		tablaConversion.setTablaDeNotas(tabla);
		
	}

	@Test
	public void testExamenTienePreguntas(){
		assertNotEquals("El examen no tiene preguntas", 0, examen.getPreguntas().size());
	}
	
	@Test
	public void testTablaTieneValores(){
		assertFalse("No hay valores para la tabla de notas", tabla.isEmpty());
	}
	
	@Test
	public void testElResultadoDeCorrecionEs7(){
		assertEquals(7.0, tablaConversion.corregirExamen(examen), 7.0);
	}
}
