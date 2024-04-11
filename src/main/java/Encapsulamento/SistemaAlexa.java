package Encapsulamento;

/**
 *
 * @author Pietro Rosolia
 */
public class SistemaAlexa{
    
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private String musica;
    private String hora;
    private boolean luz;
    
    
    // Contruct
    public SistemaAlexa() {
        this.volume = 0; 
        this.ligado = false;
        this.tocando = false;
        this.musica = "";
        this.hora = "";
        this.luz = false;
    }
    
    
    
    // Get Set
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private String getMusica() {
        return musica;
    }

    private void setMusica(String musica) {
        this.musica = musica;
    }

    private String getHora() {
        return hora;
    }

    private void setHora(String hora) {
        this.hora = hora;
    }

    private boolean getLuz() {
        return luz;
    }

    private void setLuz(boolean luz) {
        this.luz = luz;
    }
    
    
   // Métodos    
   public void Ligar() {
       if(this.getLigado()){
           System.out.println("[ERRO]: Já estou ligado!");
       }else{
           this.setLigado(true);
           System.out.println("Bom dia, dormiu bem?");
       }
        
    }

   public void Desligar() {
        if(this.getLigado()){
            this.setLigado(false);
            System.out.println("Desligando...");
        }else{
            System.out.println("[ERRO]: Já Estou desligado");
        }
    }

   public void informacoes() {
        if (this.getLigado()) {
            System.out.println("-----  MENU  -----");
            System.out.println(this.getTocando() ? "Estou tocando a musica " + getMusica() : "Não estou tocando nada");
            System.out.println("Meu volume está em " + this.getVolume());
            System.out.print("Volume: ");
            for (int i = 10; i <= this.getVolume(); i += 10) {
                System.out.print(" |");
            }
            System.out.println("");
            System.out.print("Suas luzes estão " + (this.getLuz() ? "ligadas":"desligadas"));
            System.out.println("\n-----  ******  -----");
        } else {
            System.out.println("Estou desligado!");
        }
    }

   public void Aumentar(int c) {
        if(this.getLigado() && this.getVolume() >= 0 && this.getVolume() <= 100) {
            this.setVolume(this.getVolume() + c);
        } else {
            System.out.println("[ERRO]: Não foi possível aumentar");
        }
    }
   
   public void Diminuir(int c) {
        if (this.getLigado() && this.getVolume() > 0 && this.getVolume() <= 100) {
            this.setVolume(this.getVolume() - c);
        } else {
            System.out.println("[ERRO]: Não foi possível diminuir");
        }
    }

   public void Mudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("[ERRO]");
        }
    }

   public void Desmute() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }else{
            System.out.println("[ERRO]");
        }
    }

   public void Tocar(String musica) {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
            this.setMusica(musica);
            System.out.println("Tocando música: " + this.getMusica());
        }else{
            System.out.println("[ERRO]");
        }
    }

   public void Pausar() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("Pausando música: " + this.getMusica());
            this.setMusica("");
        }
    }

   public void definirAlarme(String hora) {
        if(this.getLigado()){
            System.out.println("Alarme definido para: " + hora);
        }else{
            System.out.println("[ERRO]: Estou desligado");
        }
        
    }

   public void ligarLuz() {
        if(this.getLigado() && !this.getLuz()){
            System.out.println("Ligando as luzes.");
            this.setLuz(true);
        }else{
            System.out.println("[ERRO]");
        }
        
    }

   public void desligarLuz() {
        if(this.getLigado() && this.getLuz()){
            System.out.println("Desligando as luzes.");
            this.setLuz(false);
        }else{
            System.out.println("[ERRO]");
        }
    }
}
