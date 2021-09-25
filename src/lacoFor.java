import java.util.Scanner;

public class lacoFor {

    /*  Sintaxe FOR
    *  for (inicio ; condição ; incremento){
    *     comando 1
    *     comando 2
    * }
    * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < N; i++){
                int x = sc.nextInt();
                soma = soma + x;
        }



        System.out.println(soma);


        sc.close();
    }


}
