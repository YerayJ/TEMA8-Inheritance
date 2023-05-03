package ejercicios.ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Creación de arrays de polígonos
    static Poligono poligonos[] = new Poligono[0];

    public static void main(String[] args) {
        // Atributo que guarda la opción
        int opc;
        // Escáner para leer datos
        Scanner key = new Scanner(System.in);
        // Creación de atributos para cada lado
        double lado1, lado2, lado3;
        do {
            menu(); // Ejecuta el método menú
            opc = key.nextInt();

            switch (opc) {
                case 1 -> {
                    // Introduce los datos
                    System.out.println("Introduzca el primer lado: ");
                    lado1 = key.nextDouble();
                    key.nextLine();
                    System.out.println("Introduzca el segundo lado: ");
                    lado2 = key.nextDouble();
                    key.nextLine();
                    System.out.println("Introduzca el tercer lado: ");
                    lado3 = key.nextDouble();
                    key.nextLine();
                    // Crea un objeto
                    Poligono triangulo = new Triangulo(lado1, lado2, lado3);
                    // Llama a la función insertar
                    insertarTriangulo(triangulo);
                }
                case 2 -> {
                    // Introduce los datos
                    System.out.println("Introduzca el primer lado: ");
                    lado1 = key.nextDouble();
                    key.nextLine();
                    System.out.println("Introduzca el segundo lado: ");
                    lado2 = key.nextDouble();
                    key.nextLine();
                    // Crea un objeto
                    Poligono rectangulo = new Rectangulo(lado1, lado2);
                    // Llama a la función insertar
                    insertarRectangulo(rectangulo);
                }
                case 3 -> {
                    for (Poligono poligono:poligonos) {
                        System.out.println(poligono);
                    }
                }
            }
        } while (opc != 4);
    }

    /**
     * Método que ejecuta el menú
     */
    static public void menu() {
        System.out.println("\n---------MENÚ---------\n"
                + "1. Introducir triángulo.\n"
                + "2. Introducir rectángulo.\n"
                + "3. Mostrar contenido del array.\n"
                + "4. Salir.\n"
        );
    }

    static public void insertarTriangulo(Poligono triangulo) {
        // Amplía el espacio del array
        poligonos = Arrays.copyOf(poligonos, poligonos.length + 1);
        // Asigna la última posición
        poligonos[poligonos.length - 1] = triangulo;
    }

    static public void insertarRectangulo(Poligono triangulo) {
        // Amplía el espacio del array
        poligonos = Arrays.copyOf(poligonos, poligonos.length + 1);
        // Asigna la última posición
        poligonos[poligonos.length - 1] = triangulo;
    }

}
