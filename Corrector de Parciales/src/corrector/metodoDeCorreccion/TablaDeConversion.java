package corrector.metodoDeCorreccion;

import corrector.Examen;
import corrector.interfaces.MetodoDeCorreccion;

import java.util.Map;

/**
 * Created by ASUS.
 * @author Ignacio Doring
 */
public class TablaDeConversion implements MetodoDeCorreccion {

    private Map<Integer,Double> tablaDeNotas;

    @Override
    public Double corregirExamen(Examen examen) {
        return tablaDeNotas.get(examen.puntajeObtenido());
    }

    public Map<Integer, Double> getTablaDeNotas() {
        return tablaDeNotas;
    }

    public void setTablaDeNotas(Map<Integer, Double> tablaDeNotas) {
        this.tablaDeNotas = tablaDeNotas;
    }
}
