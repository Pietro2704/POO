package Heranca;

/**
 *
 * @author Pietro Rosolia
 */
public class Pessoa {
    
    protected String nome;
    protected int idade;
    protected char sexo; // 'M' para masculino, 'F' para feminino

    // Construtor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public void fazerAniversario(){
        this.setIdade(getIdade() + 1);
        System.out.println("Parabéns, você acabou de fazer aniversário!!");
    }
    
    public void dizerOla(){
        System.out.println("Olá, meu nome é " +getNome());
    }
    
    
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
