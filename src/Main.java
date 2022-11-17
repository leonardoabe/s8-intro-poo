import entities.Employee;
import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ex2();
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

    /**
     * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
     * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
     * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
     * (somente o salário bruto é afetado pela porcentagem)
     * e mostrar novamente os dados do funcionário.
     */
    public static void ex2() {
        System.out.println("2nd exercise");
        System.out.println("Insert employee name: ");
        String name = sc.nextLine();
        System.out.println("Insert employee gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.println("Insert tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.printf("Employee: %s, $%.2f\n", employee.getName(), employee.netSalary());

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);

        System.out.printf("Updated data: %s, $%.2f", employee.getName(), employee.netSalary());
    }
}