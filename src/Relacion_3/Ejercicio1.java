package Relacion_3;

//Ejercicio 1: Sistema de autenticación multiusuario
//Escribe un programa que solicite el nombre de usuario y la contraseña.
//Dependiendo de las credenciales introducidas, el sistema debe verificar tres
//niveles de acceso:
//- Nivel 1: Administrador (usuario: "admin", contraseña: "1234")
//- Nivel 2: Usuario normal (usuario: "user", contraseña: "abcd")
//- Nivel 3: Invitado (usuario: "guest", contraseña: "xyz")
//Si las credenciales no coinciden, mostrar un mensaje de "Acceso denegado".

import java.util.Scanner;

public class Ejercicio1 {
   public static void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca su usuario: ");
    String usuario = sc.nextLine().toLowerCase();

    System.out.println("Introduzca su contraseña: ");
    String contrasenia = sc.nextLine().toLowerCase();

    if (usuario.equals("admin") && contrasenia.equals("1234")){
        System.out.println("Bienvenido admin.");
        }
        else if (usuario.equals("user") && contrasenia.equals("abcd")){
        }
        else if (usuario.equals("guest") && contrasenia.equals("xyz")){
        }
        else {
        System.out.println("Credenciales invalidas");
        }
    }
}