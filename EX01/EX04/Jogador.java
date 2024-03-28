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
    // Exibe todas as informações do player
    public void mostraInfo(){
        System.out.println("Nome do player: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Level: " + lv);
    }
}
