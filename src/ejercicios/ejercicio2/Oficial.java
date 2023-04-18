package ejercicios.ejercicio2;

/**
 * Clase Oficial
 */
public class Oficial extends Operario{

    public Oficial(String nombre) {
        super(nombre);
    }

    /**
     * Método toString
     *
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
