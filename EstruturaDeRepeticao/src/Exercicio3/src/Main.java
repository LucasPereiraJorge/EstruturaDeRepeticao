import java.util.Scanner;

public class Main {
    static void myMethod(String nome ) {
        Scanner scanner = new Scanner(System.in);

        while (nome.length() < 3) {
            System.out.println("Nome inválido, digite novamente!");
            nome = scanner.next();
        }
        System.out.println("Bem vindo " + nome);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        myMethod(sc.next());
        System.out.println("Digite sua idade");
        myMethod2(sc.nextInt());
        System.out.println("Digite seu sexo : F - feminino, M - Masculino");
        myMethod3(false, sc.next().charAt(0));
        System.out.println("Digite seu estado civil");
        myMethod4(false, sc.next().charAt(0));

    }

    static void myMethod2(int idade) {

        Scanner sc = new Scanner(System.in);
        while (idade > 150 || idade <= 0) {
            System.out.println("idade inválida digite novamente!");
            idade = sc.nextInt();
        }
        System.out.println("Certo, sua idade é de " + idade);

    }

    static void myMethod3(boolean sexo, char sexoa) {
        Scanner sc = new Scanner(System.in);
        while (!sexo) {
            switch (sexoa) {
                case 'f' ,'F' :{sexo = true;}
                case 'm', 'M' :{sexo = true;}
            }
            if (sexo) {
                System.out.println("Sexo válido");
                break;
            }
            System.out.println("Sexo inválido");
        }

    }

    static void myMethod4(boolean estado, char estadoa) {
        Scanner sc = new Scanner(System.in);
        while (!estado) {
            switch (estadoa) {
                case 's', 'S' : {estado = true;}
                case 'c', 'C': {estado = true;}
                case 'v', 'V': {estado = true;}
                case 'd', 'D': {estado = true;}
            }
            if (estado) {
                System.out.println("Informação correta");
                break;
            }
            System.out.println("Estado incorreto!");
        }
    }
}