package Polimorfismo.sobrecarga;

/**
 *
 * @author Pietro Rosolia
 */


public class Calculadora {
    
    
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }
    
    public int subtracao(int a, int b) {
        return a - b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }
    
}
