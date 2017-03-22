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
public class Chef {
    public int tamanio;
    public boolean queso = false;
    public boolean pepperoni = false;
    public boolean lechuga = false;
    public boolean jitomate = false;
    
    public Chef(int tamanio)
    {
        this.tamanio = tamanio;
    }

    public Chef agregarQueso()
    {
        this.queso = true;
        return this;
    }

    public Chef agregarLechuga()
    {
        this.lechuga = true;
        return this;
    }
    
    
    public Chef agregarJitomate()
    {
        this.jitomate = true;
        return this;
    }
    
    
    public Chef agregarPepperoni()
    {
        this.pepperoni = true;
        return this;
    }
    
        public Hamburguesa cocinar()
    {
        return new Hamburguesa(this);
    }
}
