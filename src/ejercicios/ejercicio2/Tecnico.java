package ejercicios.ejercicio2;

/**
 * Clase Técnico
 */
public class Tecnico extends Operario{

    public Tecnico(String nombre) {
        super(nombre);
    }

    /**
     * Método toString
     *
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return super.toString() + " -> Técnico";
    }
}
