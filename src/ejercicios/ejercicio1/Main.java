package ejercicios.ejercicio1;

public class Main {
    static Hora hora = new Hora(0,0);
    static HoraExacta horaExacta = new HoraExacta(20,59,59);

    public static void main(String[] args) {
        hora.inc();
        System.out.println(hora.toString());

        horaExacta.inc();
        System.out.println(horaExacta.toString());
    }

}
