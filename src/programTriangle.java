import java.util.Locale;
import java.util.Scanner;

public class programTriangle extends triangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();


        System.out.println("Entre com as medidas do triagulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medida do trinagulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = x.area();

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo X area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area X");
        }
        else {
            System.out.println("Larger area Y");
        }



    }
}
