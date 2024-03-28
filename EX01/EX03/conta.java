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


    }
}