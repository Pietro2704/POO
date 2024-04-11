package Inicio;

public class Carro {
    
   // Atributos
    public String marca;
    public String modelo;
    public String cor;
    public int km;
    
    
    
    // Métodos
    public void Andar(int km) {
        this.km += km;
        System.out.println("O carro andou " + km + " km. Nova quilometragem: " + this.km + " km");
    } 

    public void realizarManutencao() {
        System.out.println("Realizando manutenção para o carro " + marca + " " + modelo);
        // Aqui você pode adicionar a lógica para realizar a manutenção
    }

    
    
    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    } 
}
