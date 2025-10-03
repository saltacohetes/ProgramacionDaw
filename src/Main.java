import java.sql.SQLOutput;

void main () {
    //Esto es un comentario de linea

    /* Esto es un comentario de bloque
       blabla
       blabla
     */
    System.out.printf("usa comillas no asteriscos");

    System.out.println("sout te autocompleta");

    System.out.printf("hola \t mundo"); //es un tabulador);

    System.out.printf("hola \n mundo"); // es un salto de linea);

    System.out.printf("hola \"mundo\" "); //escribir comillas dobles

    System.out.printf("hola mundo \\"); //"permite escribir una \"

    System.out.println("\n Jesús Fuentes Cantero \n C/Santa Emilia 1 \n 634538785");

    System.out.println("\n cool \t guay \n cold \t frio \n hot \t caliente");

    System.out.println("   * \n  *** \n ***** ");

    System.out.println("     * \n   *   * \n *   *   * ");

    int a1 = 10;
    int b1 = 5;
    int resultado = a1 + b1 ;
    System.out.println(resultado);


    double numero1;
    numero1=1;
    double numero2;
    numero2=100;



    Scanner jesus = new Scanner(System.in);



    System.out.println("Introduce un número:");

    numero1 = jesus.nextInt();
    System.out.println(numero1);

    numero2 = jesus.nextInt();
    System.out.println(numero2);

    double resultadoCALC = numero1 + numero2;
    System.out.println(resultadoCALC);
}

