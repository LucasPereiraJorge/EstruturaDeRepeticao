import java.util.Scanner;

public class Main {
    static void myMethod(float n1, float n2, float n3, float n4, float n5) {
        float maior1 = Math.max(n1, n2);
        float maior2 = Math.max(maior1, n3);
        float maior3 = Math.max(maior2, n4);
        float maior4 = Math.max(maior3, n5);
        System.out.println("O maior número é " + maior4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números");
        myMethod(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

    }
}
