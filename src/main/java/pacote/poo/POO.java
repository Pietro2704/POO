package pacote.poo;

// inicio
import Inicio.*;

// Encapsulamento
import Encapsulamento.*;

// Abstracao
import Abstracao.*;

//Heranca
import Heranca.*;

// Polimorfismo
import Polimorfismo.sobrecarga.*;
import Polimorfismo.substituicao.*;


public class POO {

    public static void main(String[] args) {
        
        // Início
        /*
        // Cria um objeto para a classe
        Carro car = new Carro();
        
        // Insere informações
        car.marca = "Fiat";
        car.setModelo("Palio");
        car.setCor("Vermelho");
        car.setKm(5000);
        
        // Ações
        car.Andar(120);
        
        // Retorna todas as informações
        System.out.println("Informações do carro:");
        System.out.println("Marca: " + car.marca);
        System.out.println("Modelo: " + car.getModelo());
        System.out.println("Cor: " + car.getCor());
        System.out.println("Quilometragem: " + car.getKm() + " km");
        */
        
        
        
        // Encapsulamento
        /*
        SistemaAlexa alexaEchoDOT = new SistemaAlexa();
        
        alexaEchoDOT.Ligar();
        alexaEchoDOT.informacoes();
        
        alexaEchoDOT.Aumentar(85);
        alexaEchoDOT.Tocar("Rock");
        alexaEchoDOT.ligarLuz();
        
        alexaEchoDOT.informacoes();
        */
        
        
        
        // Herança
        /*
        Pessoa fred = new Pessoa("Fred", 35, 'M');
        fred.dizerOla();
        
        Aluno roberto = new Aluno("Roberto", 20, 'M', 123456, 12321, "TADS");
        roberto.dizerOla();
        roberto.cancelarMatr();
        
        Professor girafales = new Professor("Girafales", 45, 'M', "Geografia");
        girafales.dizerOla();
        girafales.ensinarAula();
        */
        
        
        
        // Abstracao
        /*
        
        // Não posso instaciar uma forma geometrica por ser uma classe abstrata
        // FormaGeometrica forma = new FormaGeometrica();
        
        Circle circulo = new Circle(3); // raio
        Square quadrado = new Square(4.5); // lado
        
        System.out.println("A circunferencia desse círculo é de: " +circulo.calcularCircunferencia());
        System.out.println("O perímetro desse quadrado é de: " +quadrado.calcularPerimetro());
        */
        
        
        
        // Polimorfismo
        /* 
        
        // Sobrecarga
        Calculadora calculo = new Calculadora();
        
        System.err.println(calculo.soma(10, 5));            // Soma com int
        System.err.println(calculo.soma(10.7, 5.3));        // Soma com double
        
        System.err.println(calculo.subtracao(10, 5));       // Subtracao com int
        System.err.println(calculo.subtracao(10.7, 5.3));   // Subtracao com double
        */
        
        /*
        // Sobreposição
        Animal animalDesconhecido = new Animal();
        Cachorro cachorro = new Cachorro();
        
        animalDesconhecido.som();
        cachorro.som();
        */
    }
}
