public class MainJG {

    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Matheus", 0, 1);

        jogador01.aumentaPontos(1000);
        jogador01.aumentaLv();
        jogador01.mostraInfo();
    }
}