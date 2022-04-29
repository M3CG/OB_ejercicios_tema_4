package ejercicio_2;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        punto_5();
        /*
        punto_2();
        punto_3();
        punto_4();
        punto_5();
        */
    }
    
    //Punto 1: if
    public static void punto_1(){
        Scanner numero = new Scanner(System.in);
        System.out.println(" Ingrese un numero: ");
        int numeroIf = numero.nextInt();
        if ( numeroIf > 0){
            System.out.println(" La variable numeroIf guarda un numero positivo");
        } else if (numeroIf < 0){
            System.out.println(" La variable numeroIf guarda un numero negativo");
        }else{
            System.out.println(" La variable numeroIf guarda el numero 0");
        }
    }
    //Punto 2: while
    public static void punto_2(){
        Scanner numero = new Scanner(System.in);
        System.out.println(" Ingrese un numero: ");
        int numeroWhile = numero.nextInt();
        while ( numeroWhile < 3){
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }
    }
    //Punto 3: do while
    public static void punto_3(){
        Scanner numero = new Scanner(System.in);
        System.out.println(" Ingrese un numero: ");
        int numeroDoWhile = numero.nextInt();
        do{
            System.out.println("numeroWhile = " + numeroDoWhile);
            numeroDoWhile++;
        } while (false);
    }
    //Punto 4: for
    public static void punto_4(){
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor = " + numeroFor);
        }
    }
    //Punto 5: switch
    public static void punto_5(){
        Scanner numero = new Scanner(System.in);
        System.out.println(" Ingrese un numero de estacion del año(1-4): ");
        int estacion = numero.nextInt();
        
        switch (estacion){
            case 1: System.out.println("Es verano"); break;
            case 2: System.out.println("Es otoño"); break;
            case 3: System.out.println("Es invierno"); break;
            case 4: System.out.println("Es primavera"); break;
            default: System.out.println("No es un numero de estación del año");
        }
    }
}
