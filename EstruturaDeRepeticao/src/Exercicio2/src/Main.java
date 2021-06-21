import java.util.Scanner;

public class Main {
    static void myMethod(String usuario, String senha) {

        Scanner scanner = new Scanner(System.in);
        while (usuario .equalsIgnoreCase(senha)) {
            System.out.println("Seu usuário não pode ser igual a senha!");

            System.out.println("Digite seu usuário");
            usuario = scanner.next();
            System.out.println("Digite sua senha");
            senha = scanner.next();
        }
        System.out.println("Cadastro concluido!");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu usuário e senha");
        myMethod(scanner.next(), scanner.next());
    }
}
