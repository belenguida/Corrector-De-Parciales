/**
 * 
 */
package corrector.metodoDeCorreccion;

import corrector.Examen;
import corrector.interfaces.MetodoDeCorreccion;

/**
 * @author Belén
 *
 */
public class RestarN implements MetodoDeCorreccion {
	
	private Integer valorN;

    @Override
	public Double corregirExamen(Examen examen) {
		return examen.puntajeObtenido() - this.valorN;
    }

    public Integer getValorN() {
        return valorN;
    }

    public void setValorN(Integer valorN) {
        this.valorN = valorN;
    }
}
