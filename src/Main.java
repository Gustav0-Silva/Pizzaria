import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ciclo = true;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Bem vindo a Masters Pizzaria");
            System.out.println("O que deseja fazer hoje?");
            System.out.println();
            System.out.println("1 - Pedir uma pizza");
            System.out.println("2 - Cadastrar novo cliente");
            System.out.println("3 - Sair do sistema");

            String action = scanner.next();

            switch (action){
                case "1":
                    //metodo de login
                    break;
                case "2":
                    //metodo de cadastrar novo cliente
                    break;
                case "3":
                    System.out.println("Obrigado e volte sempre!");
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, por favor, informe outra");
            }

        }while(ciclo);

    }
}