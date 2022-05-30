package Usuario;

import Objetos.ArmazenaDados;
import Objetos.Cliente;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pagamento extends ArmazenaDados {

    public static void pagar(Scanner scanner, String login){
        System.out.println();
        System.out.println("Obrigado por comprar conosco");

        ImprimirPedidos.exibirTemp();

        boolean ciclo = true;
        String pagamento = "naLoja";
        Cliente cliente = retornaCliente(login);
        BigDecimal valorComEntrega = BigDecimal.valueOf(0);

        do {
            System.out.println("Deseja retirar o pedido ou deseja receber em sua casa?");
            System.out.println("1 - Retirar");
            System.out.println("2 - Receber");
            String entrega = scanner.nextLine();

            if (entrega.equals("1")){
                System.out.println("O pedido ficará disponível para retirada em 20 minutos");
                System.out.println("Nome do pedido: " + cliente.getNome());
                System.out.println("Valor total: " + valorDaVenda());

                adicionaVenda(cliente,pagamento,valorDaVenda());
                pedidosTemp.clear();

                System.out.println();
                System.out.println("Compra finalizada com sucesso, obrigado por comprar com a gente!");
                return;

            } else if (entrega.equals("2")) {
                valorComEntrega = (retornaCustoEntrega(cliente.getBairro()).add(valorDaVenda()));

                System.out.println("O pedido será enviado no endereço: " + cliente.getEndereco());
                System.out.println("Bairro: " + retornaNomeBairro(cliente.getBairro()));
                System.out.println("Taxa de entrega: " + retornaCustoEntrega(cliente.getBairro()));
                System.out.println("Valor total: " + valorComEntrega);
                System.out.println();
                ciclo = false;
            }

        }while (ciclo);

        ciclo = true;

        do {
            System.out.println("Por favor, informe o método de pagamento: ");
            System.out.println("1 - Débito");
            System.out.println("2 - Crédito");
            System.out.println("3 - Pix");
            System.out.println("4 - Dinheiro");
            pagamento = scanner.nextLine();

            if (pagamento.equals("4")){
                System.out.println("Caso precise de troco, informe o valor das sua cédula");
                System.out.println("Caso não haja necessidade, informe o valor do pedido");
                BigDecimal valorTroco = scanner.nextBigDecimal();

                valorTroco = valorTroco.subtract(valorComEntrega);

                System.out.println();
                System.out.println("Será enviado um troco de R$ " + valorTroco);
                System.out.println();
                ciclo = false;
            }else if (pagamento.equals("1") || pagamento.equals("2")){
                System.out.println();
                System.out.println("A maquininha será enviada até você");
                System.out.println();
                ciclo = false;
            } else if (pagamento.equals("3")) {
                System.out.println();
                System.out.println("Nossa chave pix: 000.000.0091-10");
                System.out.println("Nome: Thomas Antonelli Olmos Delgado");
                System.out.println("Banco: Sinqia Bank S/A");
                System.out.println();
                System.out.println("O pedido ficará disponível após a confirmação do pagamento");
                System.out.println();
                ciclo = false;
            }else {
                System.out.println("Opção inválida, tente novamente por favor");
                System.out.println();
            }
        }while (ciclo);

        adicionaVenda(cliente,pagamento,valorDaVenda());
        pedidosTemp.clear();

        System.out.println();
        System.out.println("Compra finalizada com sucesso, obrigado por comprar com a gente!");
        System.out.println();
    }

}
