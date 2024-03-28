import java.util.Scanner;

public class MainPt {
    
    public static void main(String[] args) {
        
        Produto produto01 = new Produto("Console", 12, 2, 1500.0);
        Produto produto02 = new Produto("Controle", 156, 4, 500.0);


        produto01.Infos();
        produto02.Infos();

        produto01.Estoque(5);
        produto02.Estoque(10);

        produto01.Infos();
        produto02.Infos();
    }
}
