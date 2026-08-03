/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContoladorCalculadora;
 import ModeloCalculadora.CalculadoraModelo;
/**
 *
 * @author PC
 */
public class CalculadoraControl {

   private CalculadoraModelo modelo;

    public CalculadoraControl(CalculadoraModelo modelo) {
        this.modelo = modelo;
    }
   
   
    
    
    
    
   public void sumaC(double valor) {

    modelo.setValor(valor);
    modelo.sumar();
}
   public void restaC(double valor) {

    modelo.setValor(valor);
    modelo.restar();
}
    public void multiplicarC(double valor) {

    modelo.setValor(valor);
    modelo.multiplicar();
}
    
    public void dividirC(double valor){
        modelo.setValor(valor);
        modelo.divir();
    }
    public String borrarC(String numero) {

    return modelo.borrar(numero);
}
   public void reiniciarC() {

    modelo.reiniciar();
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
