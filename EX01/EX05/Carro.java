public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int veloAt;

    public Carro(String marca, String modelo, int ano, String placa){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.veloAt = 0;

    }
    public void Velocidade(int velo){
        this.veloAt += velo;
        System.out.println("Velocidade: " + this.veloAt);
    }
    public void Freio(int velo){
        
    }
}