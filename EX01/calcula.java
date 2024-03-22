public class calcula {

    public static void main(String[] args) {

        System.out.println("-----------------");
        System.out.println("1 -----SOMA------");
        System.out.println("2 --SUBTRAÇÃO----");
        System.out.println("3 -MULTIPLICAÇÃO-");
        System.out.println("4 ----DIVISÃO----");
        
        public static Float soma(float num1, float num2){

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

            }else{
                
                return num1 / num2;
            }
        }

    }
}