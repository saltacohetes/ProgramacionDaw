import java.util.Scanner;

void main () {

    //App para  datos enteros y calcular su multiplicacion su suma y su media aritmetica'
    //Introduccion

        //valores(variables) a introducir
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;

    //Nudo y desenlace

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el primer valor: ");
    n1= sc.nextInt();
    System.out.println("Introduce el segundo valor: ");
    n2= sc.nextInt();
    System.out.println("Introduce el tercer valor: ");
    n3= sc.nextInt();
    System.out.println("Introduce el cuarto valor: ");
    n4= sc.nextInt();



    //Formulas
    double suma=n1+n2+n3+n4;
    //aqui exactamente igual que abajo, puedes poner suma en vez de to
    double multiplicacion=n1*n2*n3*n4;
    //En vez de poner n1+n2 y tal puedes poner directamente la variable suma para ahorrar
    double media=(n1+n2+n3+n4)/4;

    //con esto sacas los valores de las formulas
    System.out.println("El valor de la suma es: "+suma);
    System.out.println("El valor de la multiplicacion es: "+multiplicacion);
    System.out.println("El valor de la media es: "+media);
}
