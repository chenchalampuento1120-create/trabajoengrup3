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
    // Solicitar contraseña hasta que sea correcta
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
        System.out.println("la contraseña es correcta");
            
   
    
    
    
}
//Numeros enteros positivos
public static void ejercicio2() {
    System.out.println("Ejercicio 2");
}

// Validar que la nota ingresada esté entre 0 y 10
public static void ejercicio3() {
    System.out.println("Ejercicio 3");
    
    
}
//Simular cajero automático con máximo 3 intentos
public static void ejercicio4(){
    System.out.println("Ejercicio 4");
    
    
    
}
public static void ejercicio5(){
    System.out.println("Ejercicio 5");
    
    
    
}
public static void ejercicio6(){
    System.out.println("Ejercicio 6");
    
    
    
    
}
public static void ejercicio7(){
    System.out.println("Ejercicio 7");
    
    
    
    
}
public static void ejercicio8(){
    System.out.println("Ejercico 8");
    
    
    
}
public static void ejercicio9(){
    System.out.println("Ejercicio 9");
    System.out.println("Ingrese un numero para calcular su factorial:");
    
    int num = sc.nextInt();
    
    if(num < 0){
        
    System.out.println("No se puede calcular el factorial de un numero negativo");
        return;
    }
    //calcular factorial
    long factorial = 1;
    for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
    System.out.println("factorial = "+ factorial);
            } 

public static void ejercicio10(){
    System.out.println("Ejercicio 10");
    
    int positivos= 0,negativos=0,ceros=0;
    
    for (int i = 1; i <= 15; i++) {
        System.out.print("Ingrese el numero " + i + ": ");
        int num = sc.nextInt();
        if (num > 0) 
        positivos++;
        else if (num < 0) 
        negativos++;
        else 
        ceros++;
       }
        System.out.println("Positivos:"+positivos);
        System.out.println("Negativos:"+negativos);
        System.out.println("Ceros:"+ceros);
        }
//calcular el promedio de 20 estudiantes 
public static void ejercicio11(){
    System.out.println("Ejercicio 11");
    double suma=0;
    for (int i = 1; i <= 20; i++) {
        System.out.println("Nota estudiante"+i+":");
        suma+=sc.nextDouble();
// Calcular promedio general del curso    
        double promedio = suma / 20;
    System.out.println("Promedio: " + promedio);
    }
  }
// generar  secuencia fibonacci
public static void ejercicio12(){
    System.out.println("ejercico 12");
    System.out.println("Ingrese la cantidad de terminos:");
    int n=sc.nextInt();
    //Validar que la cantidad de términos sea mayor a cero
    if (n <= 0) {
    System.out.println("Ingrese una cantidad válida");
      return;
    }
    int a=0,b=1;
    for (int i = 1; i <= n; i++) {
        System.out.println(a+"");
        int c= a+b;
        a=b;
        b=c;
    }
    System.out.println();
        
    }
    
    
    
    
    
}
    
     

     
     

    
    

