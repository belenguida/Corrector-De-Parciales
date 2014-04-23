package corrector.testUnits;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import corrector.tipoDePregunta.*;

public class TiposDeRespuestaTest {

	VerdaderoOFalso preguntaVoF;
	static final String FALSO = "F";
	static final String VERDADERO = "V";
	
	@Before
	public void setUp() throws Exception {
		preguntaVoF = new VerdaderoOFalso();	
		preguntaVoF.esLaRespuestaCorrecta(VERDADERO);
	}

//	@Test
//	public void testTieneRespuesta(){
//		Assert.assertFalse(preguntaVoF.esLaRespuestaCorrecta(null));
//	}
	
	@Test
	public void testRespuestaEsVerdadero(){
		Assert.assertTrue(preguntaVoF.esLaRespuestaCorrecta(VERDADERO));
	}



}
