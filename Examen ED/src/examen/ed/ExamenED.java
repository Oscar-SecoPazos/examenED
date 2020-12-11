/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.ed;

import java.util.Scanner;

/**
 *
 * @author DAM127
 */
public class ExamenED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int opt;
        do{
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Pasar de horas a segundos");
            System.out.println("2. Pasar de kilómetros a metros");
            System.out.println("3. Pasar de km/h a m/s");
            System.out.println("4. Salir");
            System.out.print("Teclea la opción que quieres realizar: ");
            opt = teclado.nextInt();
            switch (opt){
                case 1:
                    System.out.print("Cuántas horas quieres pasar a segundos?: ");
                    int horas = teclado.nextInt();
                    int segundos = horas * 3600;
                    System.out.println(horas + " horas son " + segundos + " segundos.");
                    break;
                case 2:
                    System.out.println("¿Cuántos kilómetos quieres pasar a metros?: ");
                    int km = teclado.nextInt();
                    int metros = km * 1000;
                    System.out.println(km + " kilómetros son " + metros + " metros.");
                    break;
                case 3:
                    System.out.println("¿Cuántos km/h quieres pasar a m/s?: ");
                    double kmH = teclado.nextDouble();
                    double mS = kmH / 3.6;
                    System.out.println(kmH + " km/h son " + mS + " m/s.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                default:
                    System.out.println("Introduce una opción correcta.");
            }
        }while(opt!=4);
    }
    
}
