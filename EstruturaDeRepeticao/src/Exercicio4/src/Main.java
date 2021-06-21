import java.util.Scanner;

public class Main {
    static void myMethod(int cidadeA, int cidadeB, int ano) {
        while (cidadeA <= cidadeB) {
            cidadeA+= cidadeA * 0.03;
            cidadeB+= cidadeB * 0.015;
            ano += 1;

        }
        System.out.println("Sera ultrapassada em " + ano + " anos");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uma cidade com 80000 habitantes tem taxa anual de crescimento de 3%, ja a outra cidade tem 200000 com uma taxa de 1,5%");
        myMethod(80000, 200000, 0);
    }
}
