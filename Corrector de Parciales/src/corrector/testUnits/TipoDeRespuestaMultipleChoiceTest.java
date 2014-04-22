package corrector.testUnits;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import corrector.tipoDePregunta.MultipleChoise;

public class TipoDeRespuestaMultipleChoiceTest {

	MultipleChoise multipleChoice;
	
	@Before
	public void setUp() throws Exception {
		multipleChoice = new MultipleChoise();
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testTieneSeleccion(){
		Assert.assertTrue(multipleChoice.esLaRespuestaCorrecta(null));
	}

}
