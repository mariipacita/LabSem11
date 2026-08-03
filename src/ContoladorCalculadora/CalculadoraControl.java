/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContoladorCalculadora;
 import ModeloCalculadora.CalculadoraModelo;
import excepcionesCalc.DivisionEntreCeroException;
import excepcionesCalc.ValorInvalidoException;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class CalculadoraControl {

   private CalculadoraModelo modelo;

    public CalculadoraControl(CalculadoraModelo modelo) {
        this.modelo = modelo;
    }
    
   public void SumaC(double valor) {
    modelo.setResultado(valor);
    modelo.setOperacion("+");
}

  public void restaC(double valor) {
    modelo.setResultado(valor);
    modelo.setOperacion("-");
}
  
    public void multiplicarC(double valor) {
    modelo.setResultado(valor);
    modelo.setOperacion("*");
}
    
    public void dividirC(double valor) {
    modelo.setResultado(valor);
    modelo.setOperacion("/");
}
    public String borrarC(String numero) {

    return modelo.borrar(numero);
}
    public double igualC(double valor) {

    try {
        modelo.setValor(valor);

        switch (modelo.getOperacion()) {

            case "+":
                modelo.sumar();
                break;

            case "-":
                modelo.restar();
                break;

            case "*":
                modelo.multiplicar();
                break;

            case "/":
                modelo.dividir();
                break;
        }

    } catch (DivisionEntreCeroException e) {

        JOptionPane.showMessageDialog(
                null,
                e.getMessage()
        );

    } catch (ValorInvalidoException e) {

        JOptionPane.showMessageDialog(
                null,
                e.getMessage()
        );
    }
    return modelo.getResultado();
}
   public void reiniciarC() {

    modelo.reiniciar();
}     
    
}
