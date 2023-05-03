package ejercicios.interfaces.ejercicio1;

import java.util.Arrays;

public class MainArray {


    public static void main(String[] args) {
        // Creación de objetos en array
        Socio socios[] = {
                new Socio(4, "Yeray", 18),
                new Socio(2, "Juan", 20),
                new Socio(1, "Andrés", 40),
                new Socio(2, "Pepe", 20)};

        // Imprime el array
        System.out.println("\n--SOCIOS--\n");
        for (Socio s : socios) {
            System.out.println(s);
        }

        // Ordena el contenido
        Arrays.sort(socios);

        // Imprime el array
        System.out.println("\n--SOCIOS--\n");
        for (Socio s : socios) {
            System.out.println(s);
        }

    }
}
