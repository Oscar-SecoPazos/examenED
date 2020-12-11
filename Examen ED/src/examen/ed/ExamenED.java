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
            switch (opt){
                case 1:
                    int horas;
                    int segundos = horas * 3600;
                    break;
                case 2:
                    int km;
                    int metros = km * 1000;
                    break;
                case 3:
                    break;
                default:
            }
        }while(opt!=3);
    }
    
}
