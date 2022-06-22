package ActionUsuario.FinalizarPedidos.TiposPagamentos;

import ActionUsuario.FinalizarPedidos.Pagamento;

import java.math.BigDecimal;
import java.util.Scanner;

public class PagamentoDinheiro implements Pagamento {

    public String pagar(){

//        Scanner sc = new Scanner(System.in);

//        System.out.println("Caso precise de troco, informe o valor das suas cédulas");
//        System.out.println("Caso não haja necessidade, informe o valor do pedido");

        //BigDecimal valorTroco = sc.nextBigDecimal();

        //valorTroco = valorTroco.subtract(valorTotal);

        //System.out.println();

        //System.out.println("Será enviado um troco de R$ " + valorTroco);

        System.out.println();
        System.out.println("Obrigado pela preferência, pedido já está sendo preparado e enviado!");
        System.out.println();
        return "Dinheiro";
    }
}
