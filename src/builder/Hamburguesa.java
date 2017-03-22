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
public class Hamburguesa {
    protected int tamanio;
    protected boolean queso = false;
    protected boolean pepperoni = false;
    protected boolean lechuga = false;
    protected boolean jitomate = false;
    
    public Hamburguesa(Chef chef)
    {
        this.tamanio = chef.tamanio;
        this.queso = chef.queso;
        this.pepperoni = chef.pepperoni;
        this.lechuga = chef.lechuga;
        this.jitomate = chef.jitomate;
    }
    
    
   
        
    
    
}
