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
public class Oveja {
    
    protected String nombre;
    protected String categoria;
    
    
    public Oveja(String nombre)
    {
        this.nombre = nombre;
        this.categoria = "Oveja de montania";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public Oveja clonar()
    {
        return new Oveja(this.nombre);
    }
}
