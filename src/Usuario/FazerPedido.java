package Usuario;

import Objetos.ArmazenaDados;
import Objetos.Pedido;
import Produtos.PedirPizza;

import java.util.Scanner;

public class FazerPedido extends ArmazenaDados {
    public void fazerPedido(){
        Scanner scanner = new Scanner(System.in);


        boolean ciclo = true;

        do {
            System.out.println("O que você deseja pedir? ");
            System.out.println("1 - Pizza");
            System.out.println("2 - Bebida");
            System.out.println("3 - Sobremesa");
            System.out.println("4 - Sair do modo medidos");

            String action = scanner.next();

            switch (action){
                case "1":
                    PedirPizza pedirPizza;
                    break;
                case "2":
                    PedirBebida pedirBebida;
                    break;
                case "3":
                    PedirSobremesa pedirSobremesa;
                    break;
                case "4":
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, por favor, informe outra");
            }

        }while(ciclo);

    }

}
