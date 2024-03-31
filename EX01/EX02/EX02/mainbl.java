import java.util.Scanner;

public class MainBl {

    static class Livro {

        String nome;
        String autor;
        int ano;

        public Livro(String nome, String autor, int ano){

            this.nome = nome;
            this.autor = autor;
            this.ano = ano;
            

        }

        public void info(){

            System.out.println("Nome do livro: " + nome);
            System.out.println("Autor: " + autor);
            System.out.println("Ano de publicação: " + ano);
        }

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        int opcao;

        //Parte que vai aparecer para o usuário
        System.out.println("----- Biblioteca -----");
        System.out.println("1 --- ADC Livro  -----");
        System.out.println("2 --- Mostrar livros --");
        System.out.println("3 --- Sair ------------");
        System.out.println("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        // Sequencia caso o usuário escolha alguma opção
        switch (opcao) {

            case 1:

                System.out.println("Nome do livro: ");
                String nome = scanner.nextLine();

                System.out.println("Nome do autor: ");
                String autor = scanner.nextLine();

                System.out.println("Ano de publicação: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                Livro livro = new Livro(nome, autor, ano);
                biblioteca.adclivro(livro);

                break;

            case 2: 

            biblioteca.mostralivro();

                break;

            case 3: 

                System.out.println("Sair");

                break;
        
            default:

                System.out.println("Erro");
                
          }
        }
    }
}
