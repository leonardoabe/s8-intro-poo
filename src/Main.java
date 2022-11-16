import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ex1();
    }

    /**
     * Fazer um programa para ler os valores da largura e altura de um retângulo.
     * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
     */
    public static void ex1() {
        System.out.println("1st exercise");
        System.out.println("Insert rectangle width: ");
        double width = sc.nextDouble();
        System.out.println("Insert rectangle height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);

        System.out.printf("Rectangle area: %.2f\n", rectangle.area());
        System.out.printf("Rectangle perimeter: %.2f\n", rectangle.perimeter());
        System.out.printf("Rectangle diagonal: %.2f\n", rectangle.diagonal());
    }
}