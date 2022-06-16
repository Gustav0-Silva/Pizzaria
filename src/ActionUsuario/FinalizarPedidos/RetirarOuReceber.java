package ActionUsuario.FinalizarPedidos;
import Factory.FactoryVenda;
import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Utils.UtilsRetornoDeCustos;

import java.math.BigDecimal;
import java.util.Scanner;

public class RetirarOuReceber extends ArmazenaDados {

    public BigDecimal executar(Scanner sc, Cliente cliente){
        UtilsRetornoDeCustos custos = new UtilsRetornoDeCustos();
        BigDecimal valorDaVenda = custos.valorDaVenda();


        System.out.println("Deseja retirar o pedido ou deseja receber em sua casa?");
        System.out.println("1 - Retirar");
        System.out.println("2 - Receber");
        String entrega = sc.nextLine();

        switch (entrega){
            case"1":
                retirar(cliente,valorDaVenda);
                return null;
            case "2":
                return receber(cliente,valorDaVenda);
            default:
                System.out.println("Opção inválida, tente novamente");
                System.out.println();
                executar(sc,cliente);
        }
       return null;
    }

    private BigDecimal receber(Cliente cliente, BigDecimal valorDaVenda){
        BigDecimal valorComEntrega = (cliente.getCustoEntrega().add(valorDaVenda));
        System.out.println("O pedido será enviado no endereço: " + cliente.getEndereco());
        System.out.println("Bairro: " + cliente.getBairroNome());
        System.out.println("Taxa de entrega: " + cliente.getCustoEntrega());
        System.out.println("Valor total: " + valorComEntrega);
        System.out.println();
        return valorComEntrega;
    }

    private void retirar(Cliente cliente, BigDecimal valorDaVenda){
        FactoryVenda venda = new FactoryVenda();
        System.out.println("O pedido ficará disponível para retirada em 20 minutos");
        System.out.println("Nome do pedido: " + cliente.getNome());
        System.out.println("Valor total: " + valorDaVenda);

        venda.adicionaVenda(cliente,"naLoja",valorDaVenda);
        pedidosTemp.clear();

        System.out.println();
        System.out.println("Compra finalizada com sucesso, obrigado por comprar com a gente!");
    }

}
