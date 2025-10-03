void main() {

    Scanner sc = new Scanner(System.in);

    int Numero;
    int horas;
    int minutos;
    int segundos;

    System.out.println("Introduce el número: ");
    Numero = sc.nextInt();

    horas = (Numero / 60) / 60;
    System.out.println("Horas: "+horas);
    //RECUERDA QUE PARA ESTE TIPO DE COSAS HAY QUE SACAR EL RESTO DE LA DIVISION
    int resto = Numero % 3600;

    minutos = (resto / 60);
    System.out.println("Minutos: "+minutos);
    //Voy a volver a poner aqui lo del resto de la division porque se te va a olvidar
    segundos = (resto % 60);
    System.out.println("Segundos: "+segundos);

}
