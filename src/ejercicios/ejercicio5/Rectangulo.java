package ejercicios.ejercicio5;

public class Rectangulo extends Poligono {
    /**
     * Atributos que contienen los lados
     */
    private int lado1, lado2;

    /**
     * Constructor por defecto
     */
    public Rectangulo() {
        super();
    }

    public Rectangulo(int numeroLados) {
        super(numeroLados);
    }

    @Override
    double area() {
        return 0;
    }
}
