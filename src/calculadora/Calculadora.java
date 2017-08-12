/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Operaciones calcu = new Operaciones();
        
        System.out.println("¿Que operacion deseas hacer?"
                + "\n 1)Suma"
                + "\n 2)Resta"
                + "\n 3)multiplicacion"
                + "\n 4)Division");
        int op = teclado.nextInt();
        
        switch(op){
            case 1: 
                calcu.suma(); 
                break;
            case 2: 
                calcu.resta();
                break;
            case 3:
                calcu.multiplicacion();
                break;
            case 4: 
                calcu.division();
                break;
        }
        
    }
    
}
