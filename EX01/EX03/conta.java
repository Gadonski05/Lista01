public class conta{

    int conta;
    String nome;
    Float saldo;

    public conta(int conta, String nome, Float saldo){

    int Conta = conta;
    String Nome = nome;
    float Saldo = saldo;

    }

    public void deposito(float val){

        if(val > 0){
            saldo += val;
            System.out.println("Depósito de: " + val);

        }else{
            System.out.println("Operação inválida!!");
        }
    }
    public void sacar(float val){
        if( val > 0 && val <= saldo){
            saldo -= val;
            System.out.println("Você sacou:" + val);

        }else{
            System.out.println("Saque falhou!!");
     }

}
    //Parte do controle das contas
     //No caso do retorno dasinformações
    public float getSaldo(){
            return saldo;
    }

    public int getConta(){
        return conta;
    }

    public String getNome(){
        return nome;
    }
}