/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloCalculadora;

/**
 *
 * @author PC
 */
public class CalculadoraModelo {
    protected double resultado;
    private double valor;
    private String operacion;


    public CalculadoraModelo() {
        this.resultado = 0;
        this.valor = 0;
        this.operacion = "+";
        
    }

   
    
    public double getResultado() {
        return resultado;
    }

    public double getValor() {
        return valor;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
   public void sumar(){
       resultado+=valor;
   } 
   public void restar(){
       resultado-=valor;
   }
   public void multiplicar(){
       resultado*=valor;
   }
   
   public void divir(){
       resultado/=valor;
   }
     public String borrar(String numero) {

    if (numero.length() > 0) {
        return numero.substring(0, numero.length() - 1);
    }

    return "";
}
   
    public void reiniciar(){
         this.resultado = 0;
        this.valor = 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
