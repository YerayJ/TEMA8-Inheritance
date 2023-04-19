package ejercicios.ejercicio4;

/**
 * Clase electrodoméstico
 */
public class Electrodomestico {
    /**
     * Atributo que contiene el precio base
     */
    protected double precioBase = 100;

    /**
     * Atributo que contiene el color
     */
    protected enum Colores {blanco, negro, azul, rojo, gris}

    /**
     * Atributo enumerado que contiene el consumo energético
     */
    protected enum ConsumoEnergetico {A, B, C, D, E, F}

    /**
     * Atributo que contiene el peso
     */
    protected double peso = 5;

    /**
     * Color por defecto
     */
    protected Colores color = Colores.blanco;

    protected ConsumoEnergetico consumo = ConsumoEnergetico.F;

    /**
     * Constructor por defecto
     */
    public Electrodomestico() {
    }

    /**
     * Constructor con parámetros
     *
     * @param precioBase
     * @param peso
     */
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    /**
     * Getter
     *
     * @return Devuelve el precio base
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Getter
     *
     * @return Devuelve el peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Getter
     *
     * @return Devuelve el color
     */
    public Colores getColor() {
        return color;
    }

    /**
     * Getter
     *
     * @return Devuelve el consumo energético
     */
    public ConsumoEnergetico getConsumo() {
        return consumo;
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param precioBase        Contiene el precio base
     * @param peso              Contiene el peso
     * @param color             Contiene el tipo de color
     * @param consumoEnergetico Contiene el tipo de consumo
     */
    public Electrodomestico(double precioBase, double peso, String color, String consumoEnergetico) {
        this.precioBase = precioBase; // Asigna el precio
        this.peso = peso; // Asigna el peso

        // Comprueba que el color es correcto
        if (comprobarColor(color.toLowerCase())) {
            this.color = Colores.valueOf(color.toLowerCase()); // Asigna el color de tipo enum
        }
        // Comprueba que la letra es correcta
        if (comprobarConsumo(consumoEnergetico.charAt(0))) {
            this.consumo = ConsumoEnergetico.valueOf(consumoEnergetico);
        }
    }

    /**
     * Método que comprueba el color
     *
     * @param color Atributo que contiene el color
     * @return Devuelve si es correcto el color
     */
    private boolean comprobarColor(String color) {
        boolean comprueba = false; // Creación de variable booleana que comprueba si el color es correcto
        // Switch que utiliza como parámetro de entrada el color en minúsculas
        switch (color) {
            case "gris", "rojo", "azul", "negro", "blanco": {
                comprueba = true;
                break;
            }
        }
        return comprueba; // Devuelve el atributo comprueba
    }

    /**
     * Método que comprueba la letra de consumo energético
     *
     * @param letra Contiene la letra
     * @return Devuelve la letra
     */
    private boolean comprobarConsumo(char letra) {
        boolean comprueba = false; // Creación de variable booleana que comprueba si la letra es correcta
        // Comprueba que la letra esté entre A y F
        if (letra >= 'A' && letra <= 'F') {
            comprueba = true;
        }
        return comprueba; // Devuelve el atributo comprueba
    }

    /**
     * Método que calcula y devuelve el precio del electrodoméstico
     *
     * @return Devuelve el precio final
     */
    public double precioFinal() {
        double incremento = 0; // Atributo que contiene el incremento
        switch (consumo) { // Switch que coge como parámetro de entrada el consumo
            case A -> {
                incremento += 100;
            }
            case B -> {
                incremento += 80;
            }
            case C -> {
                incremento += 60;
            }
            case D -> {
                incremento += 50;
            }
            case E -> {
                incremento += 30;
            }
            case F -> {
                incremento += 10;
            }
        }
        // Comprueba en que peso está el electrodoméstico
        if (peso >= 0 && peso <= 19) {
            incremento += 10;
        } else if (peso >= 20 && peso <= 49) {
            incremento += 50;
        } else if (peso >= 50 && peso <= 79) {
            incremento += 80;
        } else if (peso >= 80) {
            incremento += 100;
        }

        return precioBase + incremento; // Devuelve el incremento
    }

}
