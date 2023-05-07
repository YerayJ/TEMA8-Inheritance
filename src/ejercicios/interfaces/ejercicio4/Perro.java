package ejercicios.interfaces.ejercicio4;

/**
 * Clase Perro
 */
public class Perro extends AnimalDomestico {

    /**
     * Constructor con parámetros
     *
     * @param nombre Contiene el nombre
     * @param raza   Contiene la raza
     * @param peso   Contiene el peso
     * @param color  Contiene el color
     */
    public Perro(String nombre, String raza, double peso, String color) {
        super(nombre, raza, peso, color);
    }

    /**
     * Método para que ladre el perro
     */
    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }

    /**
     * Método para hacer caso
     *
     * @return Devuelve el estado
     */
    @Override
    public boolean hacerCaso() {
        boolean estado = false;
        // Si sale el resultado menor al 90 por ciento el estado es true
        if (Math.random() <= 0.9) {
            estado = true;
        }
        return estado;
    }

    /**
     * Método para sacar el perro a pasear
     */
    public void sacarPaseo(){
        System.out.println("El perro ha salido de paseo");
    }

}
