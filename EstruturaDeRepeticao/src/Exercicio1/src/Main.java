import java.util.Scanner;

public class Main {
    static void myMethod(double nota) {
        Scanner scanner = new Scanner(System.in);
        while (nota > 10 || nota < 0 ) {
            System.out.println("Nota inválida! Digite corretamente.");
            nota = scanner.nextDouble();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota de 0 a 10");
        myMethod(scanner.nextDouble());

    }
}
