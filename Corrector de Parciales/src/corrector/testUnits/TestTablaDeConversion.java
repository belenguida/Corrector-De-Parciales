package corrector.testUnits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
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
	Map<Integer,Double> tabla = new HashMap<Integer,Double>();
	
	@Before
	public void setUp() throws Exception {
		preguntaVoF1.setTitulo("El Zonda es el nombre de un huracan que se encuentra en la zona cuyana de la Argentina");
		preguntaVoF1.setRespuestaCorrecta(FALSO);
        preguntaVoF1.setRespuestaDelAlumno(FALSO);
        preguntaVoF1.setPeso(1);
		preguntaVoF2.setTitulo("San Martin y Simon Bolivar se encontraron en la ciudad de Guayaquil");
		preguntaVoF2.setRespuestaCorrecta(VERDADERO);
        preguntaVoF2.setRespuestaDelAlumno(FALSO);
        preguntaVoF2.setPeso(1);

		preguntas.add(preguntaVoF1);
		preguntas.add(preguntaVoF2);
		
		examen.setPreguntas(preguntas);		
		
		tabla.put(4, 10.0);
		tabla.put(3, 6.0);
		tabla.put(2, 4.0);
		tabla.put(1, 2.0);
		
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
	public void testElResultadoDeCorrecionEs2(){
		assertEquals(2.0, tablaConversion.corregirExamen(examen), 2.0);
	}
}
