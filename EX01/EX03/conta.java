public class conta{

    int conta;
    String nome;
    Double saldo;

    public void ContaBancaria(int conta, String nome, Double saldoIn){

    this.conta = conta;
    this.nome = nome;
    this.saldo = saldoIn;

    }

    public void deposito(double val){

        if(val > 0){
            saldo += val;
            System.out.println("Depósito de: " + val);

        }else{
            System.out.println("Operação inválida!!");
        }
    }
    public void sacar(double val){
        if( val > 0 && val <= saldo){
            saldo -= val;
            System.out.println("Você sacou:" + val);

        }else{
            System.out.println("Saque falhou!!");
     }

}
    //Parte do controle das contas
     //No caso do retorno dasinformações
    public double getSaldo(){
            return saldo;
    }

    public int getConta(){
        return conta;
    }

    public String getNome(){
        return nome;
    }
}