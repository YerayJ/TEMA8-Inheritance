package ejercicios.ejercicio2;

/**
 * Clase Directivo
 */
public class Directivo extends Empleado{

    public Directivo(String nombre) {
        super(nombre);
    }

    /**
     * Método toString
     *
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
