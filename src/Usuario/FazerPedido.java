package Usuario;

import Objetos.ArmazenaDados;
import Produtos.PedirBebida;
import Produtos.PedirPizza;
import Produtos.PedirSobremesa;
import Produtos.RemoverItem;
//import Produtos.PedirPizza;

import java.util.Scanner;

public class FazerPedido extends ArmazenaDados {
    public static void fazerPedido(String login, String senha){
        Scanner scanner = new Scanner(System.in);


        boolean ciclo = true;

        do {
            System.out.println("O que você deseja pedir? ");
            System.out.println("1 - Pizza");
            System.out.println("2 - Bebida");
            System.out.println("3 - Sobremesa");
            System.out.println("4 - Remover um item");
            System.out.println("5 - Pagar");
            System.out.println("6 - Cancelar e Sair");

            String action = scanner.nextLine();

            switch (action){
                case "1":
                    PedirPizza.pedirPizza();
                    break;
                case "2":
                    PedirBebida.pedirbebida();
                    break;
                case "3":
                    PedirSobremesa.pedirSobremesa();
                    break;
                case "4":
                    RemoverItem.removerItem(scanner);
                    break;
                case "5":
                    Pagamento.pagar(scanner,login);
                    return;
                case "6":
                    pedidosTemp.clear();
                    return;
                default:
                    System.out.println("Opção inválida, por favor, informe outra");
            }

            ImprimirPedidos.exibirTemp();

        }while(ciclo);

    }

}
