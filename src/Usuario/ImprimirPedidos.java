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
    }




