package Usuario;

import Objetos.ArmazenaDados;
import Objetos.Pedido;

import java.math.BigDecimal;

public class ImprimirPedidos extends ArmazenaDados {

    public static void imprimirPedidos(){
        BigDecimal valorTotal = BigDecimal.ZERO;

        for ( Pedido pedido : pedidosTemp) {

            valorTotal = valorTotal.add(pedido.getValor());

            System.out.println("Produto:"+ pedido.getNomeProduto() +
                    " Valor: "+ pedido.getValor());

        }
        System.out.println("O valor total da compra é " + valorTotal);

    }

    public static void exibirTemp (){
        BigDecimal valorTotal = BigDecimal.valueOf(0);
        System.out.println();

        for (Pedido pedido: pedidosTemp) {
            System.out.println("Produto: " + pedido.);
            System.out.println("Valor: " + pedido.getValor());
            System.out.println("--------------------------------");

            valorTotal = valorTotal.add(pedido.getValor());
        }

        System.out.println("Valor total do pedido: R$ " + valorTotal);
        System.out.println();
    }
}




