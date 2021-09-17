import java.util.Locale;
import java.util.Scanner;

public class operadoresCumulativos {

        public class Main {
            public static void main(String[] args){
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                int minutos = sc.nextInt();
                double conta = 50.0;
                double excedente = 2.0;

                if(minutos > 100){
                    conta = conta + (minutos - 100) *excedente;
                }

                System.out.printf("Valor da conta: R$%.2f%n ", conta);

                sc.close();

            }

        }

    }





