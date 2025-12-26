
package calculator;

import calculator.calculator1; 
import javax.swing.JFrame;



public class Calculator {

    public static void main(String[] args) {
        
        JFrame calculadora = new JFrame("Calculator");
        
        calculadora.setContentPane(new calculator1());
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        calculadora.pack(); 
        calculadora.setLocationRelativeTo(null); 
        calculadora.setSize(500,600);
        calculadora.setResizable(false);
        calculadora.setVisible(true);
        
        
}
}
 