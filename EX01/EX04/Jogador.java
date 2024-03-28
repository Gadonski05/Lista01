public class Jogador {
    
    //Declaração das variáveis
    String nome;
    int pontos;
    int lv;

    public Jogador(String nome, int pontos, int lv){

        this.nome = nome;
        this.pontos = pontos;
        this.lv = lv;
    }
    //Aumento de pontos
    public void aumentaPontos(int pontos){
        pontos += pontos;
    }
    //Aumento de lv
    public void aumentaLv(){
        lv++;
    }
}
