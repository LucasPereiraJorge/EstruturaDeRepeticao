import java.util.Scanner;

public class Main {
    static void myMethod(int i) {
        for (; i <= 20; i++) {
            System.out.println(i);
        }
        for (; i <= 20; i++) {
            if (i == 20) {
                System.out.print(i);
            }
            else {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        myMethod(1);
    }
}
