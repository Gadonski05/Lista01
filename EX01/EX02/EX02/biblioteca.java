import java.util.ArrayList;

// Representação da class principal
public class Biblioteca {
        
        ArrayList<Livro> biblioteca;

        // Corpo da classe da biblioteca
        public Biblioteca(){
            // Inicialização da lista
            biblioteca = new ArrayList<>();
        }

        public void adclivro(Livro livro){

            biblioteca.add(livro);
        }

        public void mostralivro(){

            System.out.println("Biblioteca");

            for (Livro livro: biblioteca);

            Biblioteca livro;
            livro.mostralivro();
            System.out.println();
        }
    }
