package ejercicios.interfaces.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Creación de arrays
        InstalacionDeportiva polideportivos[] = {
                new Polideportivo(30, "Hytasa", 2),
                new Polideportivo(100, "UPO", 5)
        };

        Edificio edificioOficinas[] = {
                new EdificioOficinas(30, 10),
                new EdificioOficinas(150, 30)
        };

        for (InstalacionDeportiva polideportivo : polideportivos) {
            System.out.println(polideportivo);
        }
        System.out.println("\n");
        for (Edificio oficina : edificioOficinas) {
            System.out.println(oficina);
        }

    }
}
