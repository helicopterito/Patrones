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
public class Cuenta {
    
    //Variable estática donde se guarda la instancia
    private static Cuenta nueva;
    
    //Variable que guarda el valor de la instancia
    private String valor;
    
    //Constructor privado 
    private Cuenta(){
        
    }
    
    //Método que regresa la instancia única del objeto    
    public static Cuenta getInstance(){
        
        //Si la cuenta ya está instanciada no se vuelverá a crear
        if(nueva == null){
                nueva = new Cuenta();
                System.out.println("La cuenta ha sido creada");
        } else{
            System.out.println("Ya existe la cuenta");
        }        
        return nueva;
    }
    
    public void setValor(String msg){
        valor = msg;
    }
    
    public String getValor(){
        return valor;
    }        
}
