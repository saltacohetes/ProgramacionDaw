void main () {
    //Usas un string y no int o double ya que encesitas la funcion char para llamar a un caracter
    //Puedes usar un int pero despues tendrias que parsear ese int o double a string convirtiendolo asi a texto aunque es menos eficiente
    String numero;

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce 5 digitos: ");
    numero = sc.nextLine();
    //Usas char para llamar a un caracter en concreto de la linea de texo que introduces.
    //Los informaticos empezamos a contar en 0 RECUERDALO, ES IMPORTANTE
    char n1 = numero.charAt(0);
    System.out.println("El primer digito es: "+n1);
    char n2 = numero.charAt(1);
    System.out.println("El segundo digito es: "+n2);
    char n3 = numero.charAt(2);
    System.out.println("El tercer digito es: "+n3);
    char n4 = numero.charAt(3);
    System.out.println("El cuarto digito es: "+n4);
    char n5 =  numero.charAt(4);
    System.out.println("El quinto digito es: "+n5);

}
