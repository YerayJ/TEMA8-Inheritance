package ejercicios.interfaces.ejercicio4;

/**
 * Clase Gato
 */
public class Gato extends AnimalDomestico {
    /**
     * Constructor con parámetros
     *
     * @param nombre Contiene el nombre
     * @param raza   Contiene la raza
     * @param peso   Contiene el peso
     * @param color  Contiene el color
     */
    public Gato(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    /**
     * Método para que maulle el gato
     */
    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }

    /**
     * Método para hacer caso
     *
     * @return Devuelve el estado
     */
    @Override
    public boolean hacerCaso() {
        boolean estado = false;
        // Si sale el resultado menor al 5 por ciento el estado es true
        if (Math.random() <= 0.05) {
            estado = true;
        }
        return estado;
    }

    /**
     * Método que hace que el gato tosa una bola de pelo
     */
    public void toseBolaPelo(){
        System.out.println("Tose una bola de pelo");
    }
}
