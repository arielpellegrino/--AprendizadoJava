import java.util.Scanner;

public class OperadoresBitwise {
    /**
     * São operadores realizam operações logicas bit a bit em valores
     * sendo:
     *  operador & = operação E bit a bit
     *  operador | = operação OU bit a bit
     *  operador ^ = OU exclusivo bit a bit
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int mask = 0b100000;
            int n = sc.nextInt();

            if ((n & mask) != 0){
                System.out.println("sexto bit é verdadeiro");
            }

            else {
                System.out.println("sexto bit é falso");
            }

        sc.close();
    }
}

