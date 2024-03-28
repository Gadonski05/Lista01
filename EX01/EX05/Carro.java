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
    // Velocidade atual soma com a velocidade
    public void Velocidade(int velo){
        this.veloAt += velo;
        System.out.println("Velocidade: " + this.veloAt);
    }
    //Toda velocidade precisa ser maior ou igual a zero
    //Se for menor que zero, está incorreto
    public void Freio(int velo){
        if(this.veloAt - velo >= 0){
            this.veloAt -= velo;
            System.out.println("Carro está freando: " + this.veloAt);

        }else{
            System.out.println("Carro já está parado!!");
        }
    }
}