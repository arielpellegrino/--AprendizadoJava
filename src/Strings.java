import java.util.Locale;

public class Strings {


    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 28;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

//		Locale.setDefault(Locale.US);


        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, witch price is $ %.2f %n %n", product2, price2);
        System.out.printf("Record: %d yeard old, code %d and gender: %c %n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (Three decimal places): %.3f %n", measure);

        Locale.setDefault(Locale.US);

        System.out.printf("US Decimal point: %.3f", measure);


        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha
        // %.2f = double
        // %c = char


    }
}
