import java.util.Scanner;


void main () {

        double  electronica;
        double  ropa;
        double totales;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introudce el número de electroncios vendidos: ");
        electronica = sc.nextDouble();

        System.out.println("Introduce la cnatidad de ropa vendida: ");
        ropa = sc.nextDouble();

        totales = (electronica + ropa) / 100;

        electronica = electronica / totales;
        System.out.println("El porcentaje de ropa vendido es: "+electronica );

        ropa = ropa/totales;
        System.out.println("El porcentaje de ropa vendido es: "+ropa );

}
