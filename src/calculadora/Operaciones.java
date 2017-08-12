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
public class Operaciones {

    public Operaciones() {
    }
    Scanner Leer = new Scanner(System.in);
    CalculadoraDat obj = new CalculadoraDat();
    
    public double resultado;
    
    public void suma(){
        System.out.println("Ingresa el primer numero");
        double num1 = Leer.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double num2 = Leer.nextDouble();
        
        obj.setNum1(num1);
        obj.setNum2(num2);
        
        resultado=obj.getNum1()+obj.getNum2();
        
        System.out.println("El resultado es:"+resultado);
    }
    
    public void resta(){
        System.out.println("Ingresa el primer numero");
        double num1 = Leer.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double num2 = Leer.nextDouble();
        
        obj.setNum1(num1);
        obj.setNum2(num2);
        
        resultado=obj.getNum1()-obj.getNum2();
        
        System.out.println("El resultado es:"+resultado);
    }
    
    public void division(){
        System.out.println("Ingresa el primer numero");
        double num1 = Leer.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double num2 = Leer.nextDouble();
        
        obj.setNum1(num1);
        obj.setNum2(num2);
        
        resultado=obj.getNum1()/obj.getNum2();
        
        System.out.println("El resultado es:"+resultado);
    }
    
    public void multiplicacion(){
        System.out.println("Ingresa el primer numero");
        double num1 = Leer.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double num2 = Leer.nextDouble();
        
        obj.setNum1(num1);
        obj.setNum2(num2);
        
        resultado=obj.getNum1()*obj.getNum2();
        
        System.out.println("El resultado es:"+resultado);
    }
}
