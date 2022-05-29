package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Bebida;
import Objetos.Pedido;

import java.util.Scanner;

public class PedirBebida extends ArmazenaDados {

    public static void pedirbebida(){

        Scanner scanner = new Scanner(System.in);

            CadastrarBebida.imprimir();
            System.out.println("Digite a bebida que deseja");
            String sabor = scanner.nextLine();

        for (Bebida bebida : listaBebidas) {
            if (bebida.getNome().equals(sabor)) {
                Pedido pedido = new Pedido(bebida.getNome(), bebida.getValor());
                pedidosTemp.add(pedido);
            }
        }

    }
}
