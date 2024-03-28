import java.util.Scanner;

public class MainCarro {
    
    public static void main(String[] args) {
        
        Carro cadaCarro = new Carro("Audi", "RS6", 2015, "GHO012");

        System.out.println("Carro: ");
        cadaCarro.mostraInfo();

        // Mostra um contador para velocidade
        cadaCarro.Velocidade(100);
        cadaCarro.Velocidade(50);

        // Mostra um contador para frenagem
        cadaCarro.Freio(130);

        System.out.println("Estado do carro: ");
        cadaCarro.mostraInfo();
    }
}
