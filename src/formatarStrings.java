import java.util.Locale;

public class formatarStrings {
    /* Funções para formatar uma string
    *
Formatar: toLowerCase(), toUpperCase(), trim()
Recortar: substring(inicio), substring(inicio,fim)

Subistituir: Replace(char, char), Replace(String, String)

Buscar: IndexOf, LastindexOf
Cortar: str.Split("")

    * */


    public static void main(String[] args){

        String original = "abcde FGHIJ ABC abc DEFG  -  ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();   //Elima os espaços nos cantos das strings
        String s04 = original.substring(2); //pega a partir do segundo caracter em diante
        String s05 = original.substring(2, 9); //a partir da segunda até o nono dado da string
        String s06 = original.replace('a', 'x'); //Troca um caracter por outro
        String s07 = original.replace("abc", "aaa"); //troca conjunto de dados

        int i = original.indexOf("bc"); //pega a primeira ocorrencia da String
        int j = original.lastIndexOf("bc"); //pega a ultima ocorrencia da String


        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03 + " - ");

        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(i);
        System.out.println(j);


        String s = "batata maçã limão";
        String[] vect = s.split(" ");

        System.out.println(vect [0]);
        System.out.println(vect [1]);
        System.out.println(vect [2]);
    }
}
