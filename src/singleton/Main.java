/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author uchitel
 */
public class Main {
    
    public static void main(String[] args) {
     
        //Acceder a la instancia del objeto
        Cuenta c1 = Cuenta.getInstance();
        Cuenta c2 = Cuenta.getInstance();
        
        //Dar valor a c1
        c1.setValor("Cuenta del usuario xxxx");
        
        //Imprimir el valor de la c2
        System.out.println(c2.getValor());                
    }   
}
