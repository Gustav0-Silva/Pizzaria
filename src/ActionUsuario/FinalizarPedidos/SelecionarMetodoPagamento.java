package ActionUsuario.FinalizarPedidos;

import java.math.BigDecimal;
import java.util.Scanner;

public class SelecionarMetodoPagamento {
    String pagamento;

    public String executar(Scanner sc, BigDecimal valorTotal){
        System.out.println("Por favor, informe o método de pagamento: ");
        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");
        System.out.println("3 - Pix");
        System.out.println("4 - Dinheiro");
        pagamento = sc.nextLine();

        switch (pagamento){
            case "1":
                pagamentoDebito();
                break;
            case "2":
                pagamentoCredito();
                break;
            case "3":
                pagamentoPix();
                break;
            case "4":
                pagamentoDinheiro(sc,valorTotal);
                break;
            default:
                System.out.println("Método inválido, tente novamente");
                System.out.println();
                executar(sc,valorTotal);
        }
        return pagamento;
    }
    private void pagamentoDebito(){
        System.out.println();
        System.out.println("A maquininha será enviada até você");
        System.out.println();
        pagamento = "Débito";
    }
    private void pagamentoCredito(){
        System.out.println();
        System.out.println("A maquininha será enviada até você");
        System.out.println();
        pagamento = "Crédito";
    }

    private void pagamentoPix(){
        System.out.println();
        System.out.println("Nossa chave pix: 000.000.0091-10");
        System.out.println("Nome: Thomas Antonelli Olmos Delgado");
        System.out.println("Banco: Sinqia Bank S/A");
        System.out.println();
        System.out.println("O pedido ficará disponível após a confirmação do pagamento");
        System.out.println();
        pagamento = "Pix";
    }
    private void pagamentoDinheiro(Scanner sc, BigDecimal valorTotal){
        System.out.println("Caso precise de troco, informe o valor das suas cédulas");
        System.out.println("Caso não haja necessidade, informe o valor do pedido");
        BigDecimal valorTroco = sc.nextBigDecimal();

        valorTroco = valorTroco.subtract(valorTotal);

        System.out.println();
        System.out.println("Será enviado um troco de R$ " + valorTroco);
        System.out.println();
        pagamento = "Dinheiro";
    }
}
