package Abstracao;

/**
 *
 * @author Pietro Rosolia
 */
public class Circle extends FormaGeometrica{
    
    private final int lados = 0;
    private double raio;
    private final double PI = Math.PI;

    // Construtor
    public Circle(double raio) {
        this.raio = raio;
    }
    
    
    
    // Métodos abstratos
    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    @Override
    public double calcularCircunferencia() {
        return calcularPerimetro();
    }
    

   
}
