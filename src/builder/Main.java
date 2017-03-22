/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author uchitel
 */
public class Main {
    
    public static void main(String[] args) {
        
            Hamburguesa hamburguesa = (new Chef(14)).agregarLechuga().agregarQueso().agregarPepperoni().cocinar();
            
           System.out.println("La hamburguesa tiene queso: " + hamburguesa.queso);
           System.out.println("La hamburguesa tiene jitomate: " + hamburguesa.jitomate);
        
    }
    
}
