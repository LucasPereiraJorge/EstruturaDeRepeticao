import java.util.Scanner;

public class Main {

    static void myMethod(float n1, float n2, float n3, float n4, float n5){
        float soma =  (n1+n2+n3+n4+n5);
        float media = soma/5;
        System.out.println("A soma foi de " + soma + " ja a média é de " + media);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números");
        myMethod(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
    }
}
