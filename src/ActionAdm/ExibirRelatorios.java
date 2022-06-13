package ActionAdm;

import Objetos.ArmazenaDados;
import Objetos.Produto;
import Objetos.ProdutosVendidos;

import java.util.Scanner;

public class ExibirRelatorios extends ArmazenaDados {

    public void executar(Scanner sc){
        System.out.println();
        System.out.println("Digite qual o tipo de relatório que deseja");
        System.out.println("1 - Vendas Gerais");
        System.out.println("2 - Vendas por cartão de crédito");
        System.out.println("3 - Vendas por cartão de débito");
        System.out.println("4 - Vendas por pix");
        System.out.println("5 - Vendas em dinheiro");
        System.out.println("6 - Vendas pagas na loja");
        System.out.println("7 - Cancelar");

        String action = sc.nextLine();

        switch (action){
            case "1":
                vendasGerais();
                break;
            case "2":
                vendasFiltradas("Crédito");
                break;
            case "3":
                vendasFiltradas("Débito");
                break;
            case "4":
                vendasFiltradas("Pix");
            case "5":
                vendasFiltradas("Dinheiro");
                break;
            case "6":
                vendasFiltradas("naLoja");
                break;
            case "7":
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void vendasFiltradas(String metodo){
        for (ProdutosVendidos vendidos: listaVendidos) {
            if (vendidos.getMetodoPagamento().equals(metodo)) {
                System.out.println("Nome do cliente: " + vendidos.getCliente().getNome());
                System.out.println("Itens da compra: ");
                for (Produto produto: vendidos.getListaPedidosFinal()) {
                    System.out.println("--- Nome: " + produto.getNome());
                    System.out.println("--- Valor: " + produto.getValor());
                    System.out.println("--------------");
                }
                System.out.println("Valor total da compra: R$ " + vendidos.getValorCompra());
                System.out.println("Metodo de pagamento: " + vendidos.getMetodoPagamento());
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }

    private void vendasGerais(){
        for (ProdutosVendidos vendidos: listaVendidos) {
            System.out.println("Nome do cliente: " + vendidos.getCliente().getNome());
            System.out.println("Itens da compra: ");
            for (Produto produto: vendidos.getListaPedidosFinal()) {
                System.out.println("--- Nome: " + produto.getNome());
                System.out.println("--- Valor: " + produto.getValor());
                System.out.println("--------------");
            }
            System.out.println("Valor total da compra: R$ " + vendidos.getValorCompra());
            System.out.println("Metodo de pagamento: " + vendidos.getMetodoPagamento());
            System.out.println("-----------------------------------------");
            System.out.println();
        }
    }


}
