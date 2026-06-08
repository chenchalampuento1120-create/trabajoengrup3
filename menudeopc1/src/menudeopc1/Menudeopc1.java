/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menudeopc1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Menudeopc1 {
    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int opcion;
     do{
         System.out.println("======================MENU DE EJERCICIOS=================");
         System.out.println("1. identificacion con intentos ilimitados");
         System.out.println("2. numeros positivos hasta negativos");
         System.out.println("3. validar nota entre 0 y 10");
         System.out.println("4. cajero automatico");
         System.out.println("5. contar pares e impares");
         System.out.println("6. ventas dirias");
         System.out.println("7. numeros hasta negativos");
         System.out.println("8. tabla de multiplicar");
         System.out.println("9. factorial");
         System.out.println("10. numeros positivos negativos y ceros");
         System.out.println("11. calificaciones de 20 estudiantes");
         System.out.println("12. serie de fibonacci");
         System.out.println("0. salir");
         
         opcion = sc.nextInt();
         
         switch (opcion){
             
             case 1 -> ejercicio1();
             case 2 -> ejercicio2();
             case 3 -> ejercicio3();
             case 4 -> ejercicio4();
             case 5 -> ejercicio5();
             case 6 -> ejercicio6();
             case 7 -> ejercicio7();
             case 8 -> ejercicio8();
             case 9 -> ejercicio9();
             case 10 -> ejercicio10();
             case 11 -> ejercicio11();
             case 12 -> ejercicio12();
             case 0 -> System.out.println("programa finalizado. ");
             default -> System.out.println("opcion invalida ingrese denuevo....");
         }
            
         }while (opcion != 0);
    }
    // primer ejercicio
    public static void ejercicio1() {
    System.out.println("Ejercicio 1");
    String claveCorrecta = "tarea";
    String clave;
    int intentos =0;
    do {
        System.out.println("ingrese su contraseña ");
        clave=sc.next();
        intentos++;
    }while (!clave.equals(claveCorrecta));
            
   
    
    
    
}

public static void ejercicio2() {
    System.out.println("Ejercicio 2");
}

public static void ejercicio3() {
    System.out.println("Ejercicio 3");
    
    
}
public static void ejercicio4(){
    System.out.println("Ejercicio 4");
    
    
    
}
public static void ejercicio5(){
    System.out.println("Ejercicio 5");
    
    Scanner leer = new Scanner(System.in);

    int numero;
    int pares = 0;
    int impares = 0;
    do {

        System.out.println("Ingrese un numero:");
        numero = leer.nextInt();

        if (numero != 0) {

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

        }

    } while (numero != 0);

    System.out.println("Cantidad de pares: " + pares);
    System.out.println("Cantidad de impares: " + impares);

    
}

public static void ejercicio6(){
    System.out.println("Ejercicio 6");

    Scanner leer = new Scanner(System.in);

    double venta;
    double total = 0;
    int cantidadVentas = 0;

    do {

        System.out.println("Ingrese una venta:");
        venta = leer.nextDouble();

        if (venta != 0) {
            total = total + venta;
            cantidadVentas++;
        }

    } while (venta != 0);
}
public static void ejercicio7(){
    System.out.println("Ejercicio 7");
    
    
    
    
}
public static void ejercicio8(){
    System.out.println("Ejercico 8");
    
    
    
}
public static void ejercicio9(){
    System.out.println("Ejercicio 9");
    System.out.println("Ingrese un numero:");
    
    int num = sc.nextInt();
      long factorial = 1;
    for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
            
    
    
    
    
} 
public static void ejercicio10(){
    System.out.println("Ejercicio 10");
    
    
    
    
}
public static void ejercicio11(){
    System.out.println("Ejercicio 11");
    
    
    
    
}
public static void ejercicio12(){
    System.out.println("ejercico 12");
    
    
    
    
    
}
    
     
}
     
     

    
    

