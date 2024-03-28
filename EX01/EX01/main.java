import java.util.Scanner;

public class main {
        
    public class calcula {

        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
        
            System.out.println("-----------------");
            System.out.println("1 -----SOMA------");
            System.out.println("2 --SUBTRAÇÃO----");
            System.out.println("3 -MULTIPLICAÇÃO-");
            System.out.println("4 ----DIVISÃO----");
                
            System.out.println("Escolha o numero da operação: 1 - 2 - 3 - 4 - 5");
            int operacao = Scanner.nextInt();

            System.out.println("Primeiro numero: ");
            float num1 = Scanner.nextFloat();

            System.out.println("Segundo numero: ");
            float num2 = Scanner.nextFloat();

            float resultado = calcula.calculadora(operacao, num1, num2);

        }
    }
}
