/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author uchitel
 */
public class Main {
    
    public static void main(String[] args) {
        Oveja original = new Oveja("Dolly");
        System.out.println(original.getNombre() + " " +original.getCategoria());
        Oveja copia = original.clonar();
        System.out.println(copia.getNombre() + " " + copia.getCategoria());
        copia.setNombre("Jolly");
        System.out.println(original.getNombre() + " " +original.getCategoria());
        System.out.println(copia.getNombre() + " " + copia.getCategoria());
    }
    
}
