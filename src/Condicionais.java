import java.util.Scanner;

public class Condicionais {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int hora;

            System.out.println("Que horas sao?");
            hora = sc.nextInt();

            if (hora < 12) {
                System.out.println("Olá, Bom dia");
            }
            else {
                if (hora <= 18) {
                    System.out.println("Olá, boa tarde!");

                } else {
                    System.out.println("Boa noite, durma bem");
                }
            }

            sc.close();

        }

}


    /*Ecpresões comparativas*/

    /*
    Maior    >
    menor    <
    maior ou igual >=
    menor ou igual <=
    igual   ==
    diferente !=
     */


     /* Operadores logicos */

    /*
    *   && = E
    *   || = OU
    *   !  = NÃO
    * */

    /* Sintaxe da estrutura condicional simples */

    /*
        if (<<Condição>>){
            <comando1>
            <comando2>

        }
     */

    /* Sintaxe da estrutura condicional COMPOSTA */

    /*
        if (<<Condição>>){
            <comando1>
            <comando2>
        }

        else {
            <comando3>
            <comando4>
        }
     */



