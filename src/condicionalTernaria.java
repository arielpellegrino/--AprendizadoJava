import java.util.Scanner;

public class condicionalTernaria {
    /* Sintaxe: Expressão condicional ternária
    *  ( condição ) ? valor se verdadeiro : valor se falso
    *
    * ex:
    * ( 2 > 3) ? 50 : 80      resultado: 80
    *  (10 !=3) ? "Maria" : "Alex"     resultado: "Maria"
    * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double preco = 34.5;
        double desconto = (preco < 20.0) ? desconto = preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
        sc.close();


    }

}
