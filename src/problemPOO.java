import java.util.Locale;
import java.util.Scanner;
import

public class problemPOO {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;


        System.out.println("Entre com a medidas do triangulo x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Entre com as medidas o triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangule a area de X %.4f%n", areaX);
        System.out.printf("Triangule a area de Y %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("Triangulo X area: %.4f%n" + areaX);

        }

        else{
            System.out.printf("Triangulo Y area: %.4f%n", areaY);
        }
        sc.close();
    }

}
