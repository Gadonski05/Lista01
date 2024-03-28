import java.util.ArrayList;
import java.util.List;

class Contato{

    private String nome;
    private int fone;

    public Contato(String nome, int fone){
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome(){
    return nome;

    }
    public int getFone(){
        return fone;
    }
}
class Agenda {
    private List<Contato> contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public void adcContato(Contato contato)
}