public class calcula {

        public static float calculadora(int operacao, float num1, float num2){
            float resultado = 0;

            switch (operacao) {

                case 1:
                resultado = soma(num1, num2);
                break;

                case 2:
                resultado = soma(num1, num2);
                break;

                case 3:
                resultado = soma(num1, num2);
                break;

                case 4:
                resultado = soma(num1, num2);
                break;
            
                default:
                    break;
            }

            return resultado;
        }
        
        public static float soma(float num1, float num2){

            return num1 + num2;
        }

        public static float sub(float num1, float num2){

            return num1 - num2;
        }

        public static float mult(float num1, float num2){

            return num1 * num2;
        }

        public static float div(float num1, float num2){

            if (num2 == 0) {

                System.out.println("Divisão incorreta!!");
                return 0;

            }else{
                
                return num1 / num2;
            }
        }

    }
