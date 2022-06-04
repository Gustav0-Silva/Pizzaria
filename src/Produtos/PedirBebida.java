package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Bebida;
import Objetos.Pedido;
import Objetos.TiposProdutos;

import java.util.Scanner;

public class PedirBebida extends ArmazenaDados {

    public static void pedirbebida(){

        Scanner scanner = new Scanner(System.in);

            imprimirProdutos(TiposProdutos.BEBIDA);
            System.out.println("Digite a bebida que deseja ou digite s para sair");
            String sabor = scanner.nextLine();

            if (sabor.equalsIgnoreCase("s")){
                return;
            }

        for (Bebida bebida : listaBebidas) {
            if (bebida.getNome().equalsIgnoreCase(sabor)) {
                Pedido pedido = new Pedido(bebida.getNome(), bebida.getValor());
                pedidosTemp.add(pedido);
            }
        }

    }
}
