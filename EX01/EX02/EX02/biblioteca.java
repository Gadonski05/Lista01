import java.util.ArrayList;

// Representação da class principal
public class biblioteca {
        
        ArrayList<Livro> biblioteca;

        // Corpo da classe da biblioteca
        public biblioteca(){
            // Inicialização da lista
            biblioteca = new ArrayList<>();
        }

        public void adclivro(Livro){

            biblioteca.add(Livro);
        }

        public void mostralivro(){

            System.out.println("Biblioteca");

            for (Livro livro: biblioteca);

            livro.mostralivro();
            System.out.println();
        }
    }
