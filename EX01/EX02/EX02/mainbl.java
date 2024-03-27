import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class mainbl {
    public static void main(String[] args) {
        
        biblioteca = new biblioteca();
        Scanner Scanner = new Scanner(System.in);

        System.out.println();

        int opcao;

        //Parte que vai aparecer para o usuário
        System.out.println("----- Biblioteca -----");
        System.out.println("1 --- ADC Livro  -----");
        System.out.println("2 --- Mostrar livros --");
        System.out.println("3 --- Sair ------------");
        System.out.println("Escolha uma opção: ");
        opcao = Scanner.nextLine();

        // Sequencia caso o usuário escolha alguma opção
        switch (opcao) {
            case 1:
                System.out.println("Nome do livro: ");
                String nome = Scanner.nextLine();

                System.out.println("Nome do autor: ");
                String autor = Scanner.nextLine();

                System.out.println("Ano de publicação: ");
                int ano = Scanner.nextInt();

                break;

            case 2:
                biblioteca.Mostrar();

                break;

            case 3: 
                System.out.println("Sair");

                break;
        
            default:
                System.out.println("Erro");
                
        }

        class Livro {

            String nome;
            String autor;
            int ano;

            public Livro(String nome, String autor, int ano){

                nome = nomeLivro;
                autor = autorLivro;
                ano = anoPublic;
            }
            public void info(){
                System.out.println("Nome do livro: " + nome);
                System.out.println("Autor: " + autor);
                System.out.println("Ano de publicação: " + ano);
            }
        }
    }
}
