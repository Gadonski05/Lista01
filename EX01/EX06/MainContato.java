import java.util.Scanner;

public class MainContato {
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
    

    agenda.adcContato(new Contato("Matheus", "123456789"));
    agenda.adcContato(new Contato("Mat", "143456789"));
    agenda.adcContato(new Contato("Marte", "423456789"));

    String nomeBusca = "Matheus";
    Contato contatoencontrado = agenda.buscaContato(nomeBusca);

    if (contatoencontrado != null) {
        
        System.out.println("Encontrar contato: ");
        System.out.println("Nome: "+ contatoencontrado.getNome());
        System.out.println("Telefone: " + contatoencontrado.getFone());

    }else{
        System.out.println("Contato não encontrado");
    }
  }
}
