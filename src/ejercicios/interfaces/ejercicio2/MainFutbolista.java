package ejercicios.interfaces.ejercicio2;

import java.util.Arrays;

public class MainFutbolista {
    public static void main(String[] args) {
        // Creación de array con 5 futbolistas
        Futbolista futbolistas[] = {
                new Futbolista(7, "Cristiano Ronaldo", 37, 912),
                new Futbolista(10, "Lionel Messi", 36, 899),
                new Futbolista(11, "Neymar JR", 31, 530),
                new Futbolista(7, "Kylian Mbappé", 24, 267)
        };

        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista);
        }

        Arrays.sort(futbolistas);

        System.out.println("\n");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista);
        }

    }
}
