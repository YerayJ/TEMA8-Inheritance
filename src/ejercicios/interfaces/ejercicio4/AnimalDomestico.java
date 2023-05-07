package ejercicios.interfaces.ejercicio4;

/**
 * Clase Animal doméstico
 */
public abstract class AnimalDomestico implements Animal {
    /**
     * Atributo que contiene el nombre
     */
    private String nombre;
    /**
     * Atributo que contiene la raza
     */
    private String raza;
    /**
     * Atributo que contiene el peso
     */
    private double peso;
    /**
     * Atributo que contiene el color
     */
    private String color;

    /**
     * Constructor con parámetros
     * @param nombre Contiene el nombre
     * @param raza Contiene la raza
     * @param peso Contiene el peso
     * @param color Contiene el color
     */
    public AnimalDomestico(String nombre, String raza, double peso, String color) {
        this.nombre = nombre;
        this.raza = raza;
        if (peso <= 0) {
            peso = 0.1;
        }
        this.peso = peso;
        this.color = color;
    }

    /**
     * Getter
     * @return Devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     * @param nombre Contiene el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     * @return Devuelve la raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Setter
     * @param raza Contiene la raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Getter
     * @return Devuelve el peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Setter
     * @param peso Contiene el peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Getter
     * @return Devuelve el color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter
     * @param color Contiene el color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método para vacunar a un animal
     */
    public abstract void vacunar();

    /**
     * Método para que un animal haga caso
     */
    public abstract void hacerCaso();

    /**
     * Método que indica que está durmiendo
     */
    @Override
    public void dormir() {
        System.out.println("Zzz");
    }
}
