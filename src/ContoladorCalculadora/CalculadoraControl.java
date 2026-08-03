/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContoladorCalculadora;
 import ModeloCalculadora.CalculadoraModelo;
import excepcionesCalc.DivisionEntreCeroException;
import excepcionesCalc.ValorInvalidoException;
/**
 *
 * @author PC
 */
public class CalculadoraControl {

   private CalculadoraModelo modelo;

    public CalculadoraControl(CalculadoraModelo modelo) {
        this.modelo = modelo;
    }
   
   
    
    
    
    
   public void sumaC(double valor) throws ValorInvalidoException {

    modelo.setValor(valor);
    modelo.sumar();
}
   public void restaC(double valor) throws ValorInvalidoException {

    modelo.setValor(valor);
    modelo.restar();
}
    public void multiplicarC(double valor) throws ValorInvalidoException {

    modelo.setValor(valor);
    modelo.multiplicar();
}
    
    public void dividirC(double valor) throws ValorInvalidoException, DivisionEntreCeroException{
        modelo.setValor(valor);
        modelo.dividir();
    }
    public String borrarC(String numero) {

    return modelo.borrar(numero);
}
    public double igualC() {
    return modelo.getResultado();
}
   public void reiniciarC() {

    modelo.reiniciar();
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
