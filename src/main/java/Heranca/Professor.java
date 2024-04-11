package Heranca;

/**
 *
 * @author Pietro Rosolia
 */
public class Professor extends Pessoa{
    
    private String disciplina;
    
    public Professor(String nome, int idade, char sexo, String disciplina) {
        super(nome, idade, sexo); // Chama o construtor da superclasse Pessoa
        this.disciplina = disciplina;
    }
    
    public void ensinarAula() {
        System.out.println("O professor " + this.nome + " está ensinando uma aula de " + this.disciplina);
    }
}
