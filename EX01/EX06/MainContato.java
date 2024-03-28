import java.util.Scanner;

public class MainContato {
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
    

    agenda.adcContato(new Contato("Matheus", "123456789"));
    agenda.adcContato(new Contato("Matheus", "123456789"));
    agenda.adcContato(new Contato("Matheus", "123456789"));

    String nomeBusca = "Matheus";
    Contato contatoencontrado = agenda.buscaContato(nomeBusca)
    }

}
