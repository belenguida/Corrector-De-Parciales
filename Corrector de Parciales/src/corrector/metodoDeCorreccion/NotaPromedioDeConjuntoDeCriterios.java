package corrector.metodoDeCorreccion;

import corrector.Examen;
import corrector.interfaces.MetodoDeCorreccion;

import java.util.List;

/**
 * Created by ASUS.
 * @author Ignacio Doring
 */
public class NotaPromedioDeConjuntoDeCriterios implements MetodoDeCorreccion {

    private List<MetodoDeCorreccion> conjuntoDeCriterios;

    @Override
    public Double corregirExamen(Examen examen) {

        return this.conjuntoDeCriterios.stream().mapToDouble(m -> m.corregirExamen(examen)).average().getAsDouble();


    }
}

