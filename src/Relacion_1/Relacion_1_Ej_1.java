import java.util.Scanner;

void main () {

    //App para calcular el area y perimetro de una circunferencia//


    //Introduccion

    //esto son variables, las int son para enteros y la double para numeros con decimales
    double area;
    double pi=3.14;
    int radio=0;
    double perimetro;

    //Nudo

    //Ten en cuenta que el escaner se usa para introducir un valor por consola por parte del usario
    Scanner sc = new Scanner(System.in);
    //Aqui sacas el texto entre comillas por consola
    System.out.println("Introduce el radio de la circunfenrecia: ");
    //Aqui estas llamando al scanner (sc) para introducir el valor de radio
    radio = sc.nextInt();

    //Formulas para sacar el radio y el perimtro
    area = pi * (radio * radio);
    perimetro= 2 * pi * radio;

    // Si lees numeros el bufer puedes quedar sucio recuerda hacer un sc.nextLine()


    //Desenlace
    //esto esta sacando el texto por consola y llamando la variable de area que es lo que debe sacar
    System.out.println("El area del circulo es: "+area);
    System.out.println("El perimetro del circulo es: "+perimetro);







}