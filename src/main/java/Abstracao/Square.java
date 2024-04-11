package Abstracao;

/**
 *
 * @author Pietro Rosolia
 */
public class Square extends FormaGeometrica {
    
    private final int lados = 4;
    private double lado;

    // Construtor
    public Square(double lado) {
        this.lado = lado;
    }

    // Métodos abstratos
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularCircunferencia() {
        return 0;
    }

}
