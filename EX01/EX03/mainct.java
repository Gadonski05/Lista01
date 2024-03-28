import java.util.Scanner;

public class mainct {
    
    public static void main(String[] args) {
        
        //Criação da conta
        conta conta = new ContaBancaria(121105, "Matheus", 1500.0);

        //parte das operações financeiras
        //Faz a ligação direta da conta com a ação de saque e depósito
        conta.deposito(1000.0);
        conta.sacar(350.0);

        System.out.println("Saldo da conta: " + conta.getSaldo);
    }
}
