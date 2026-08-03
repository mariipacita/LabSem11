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

    try {
        modelo.setValor(valor);
        modelo.sumar();

    } catch (ValorInvalidoException e) {
        JOptionPane.showMessageDialog(
                null,
                e.getMessage()
        );
    }
}

   public void restaC(double valor) {

    try {
        modelo.setValor(valor);
        modelo.restar();

    } catch (ValorInvalidoException e) {
        JOptionPane.showMessageDialog(
                null,
                e.getMessage()
        );
    }
}
    public void multiplicarC(double valor) {

    try {
        modelo.setValor(valor);
        modelo.multiplicar();

    } catch (ValorInvalidoException e) {
        JOptionPane.showMessageDialog(
                null,
                e.getMessage()
        );
    }
}
    
    public void dividirC(double valor) {

    try {
        modelo.setValor(valor);
        modelo.dividir();

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
