import java.util.Scanner;

public class Main {

    static void myMethod(int popuA, int popuB, int taxA,int taxB, int ano) {
        while (popuA < popuB ) {
            popuA += popuA * taxA;
            popuB += popuB * taxB;
            ano += 1;

        }
        System.out.println("Sera ultrapassado em " + ano + " anos");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe A população de A e sua taxa de crescimento, informe a população de B e sua taxa de crescimento");
        myMethod(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), 0);
    }
}
