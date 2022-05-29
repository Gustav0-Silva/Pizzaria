package Usuario;

import Objetos.ArmazenaDados;
import Objetos.Pedido;
import Produtos.PedirBebida;
import Produtos.PedirPizza;
import Produtos.PedirSobremesa;
//import Produtos.PedirPizza;

import java.util.Scanner;

public class FazerPedido extends ArmazenaDados {
    public static void fazerPedido(){
        Scanner scanner = new Scanner(System.in);


        boolean ciclo = true;

        do {
            System.out.println("O que você deseja pedir? ");
            System.out.println("1 - Pizza");
            System.out.println("2 - Bebida");
            System.out.println("3 - Sobremesa");
            System.out.println("4 - Sair do modo pedidos");

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
                    ImprimirPedidos.imprimirPedidos();
                    ciclo = false;
                    //Pagar.pagar();

                    //zerar pedisotemp
                    //imprimir pedido
                    break;
                default:
                    System.out.println("Opção inválida, por favor, informe outra");
            }

        }while(ciclo);

    }

}
