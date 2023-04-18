package ejercicios.ejercicio2;

/**
 * Clase Operario
 */
public class Operario extends Empleado{

    public Operario(String nombre) {
        super(nombre);
    }

    /**
     * Método toString
     *
     * @return Devuelve una cadena
     */
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}
