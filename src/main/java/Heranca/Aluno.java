package Heranca;

/**
 *
 * @author Pietro Rosolia
 */
public class Aluno extends Pessoa{
    private int ra;
    private int senha;
    private String curso;
    
    public Aluno(String nome, int idade, char sexo, int ra, int senha, String curso) {
        super(nome, idade, sexo); // Chama o construtor da superclasse Pessoa
        this.ra = ra;
        this.senha = senha;
        this.curso = curso;
    }
    
    public void cancelarMatr(){
        System.out.println(this.getNome() + " encerrou a matrícula do curso " + this.curso);
    }
}
