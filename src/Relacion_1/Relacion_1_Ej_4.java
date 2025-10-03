import java.util.Scanner;


void main() {

    Scanner sc = new Scanner(System.in);

    int A,B,C;
    //Ya que vas a realizar un intercambio y debes guardar por ahi el valor de una de las variable usa la P de variable de paso.
    int aux;


    System.out.println("Introduce el valor de A: ");
    A = sc.nextInt();
    System.out.println("Introduce el valor de B: ");
    B = sc.nextInt();
    System.out.println("Introduce el valor de C: ");
    C = sc.nextInt();
    //Recuerda que la ultima variable a convertir es en la que debes usar la variable auxiliar en ese caso P para guardar el valor de A y no perderlo
    aux = A;

    A = C;
    C = B;
    B = aux;


    System.out.println("EL valor nuevo de A es: "+A);
    System.out.println("EL valor nuevo de B es: "+B);
    System.out.println("EL valor nuevo de C es: "+C);


}
