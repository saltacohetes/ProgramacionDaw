package PracticaElectrodoestcosPDO;


import java.sql.SQLOutput;

public class Main {
    public static void main() {
        Lavadora lavadoraAEG = new Lavadora(400, Electrodomesticos.Color.Plateado, "PK", 30, 7);
        System.out.printf("La lavadora cuesta: %s%n", lavadoraAEG.precioFinal());

        Television tvSamsung = new Television(190, Electrodomesticos.Color.Negro, "A+", 10, 24, true);
        System.out.printf("La tele cuesta: %s%n", tvSamsung.precioFinal());
    }
}
