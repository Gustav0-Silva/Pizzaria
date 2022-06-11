package Produtos;

import Objetos.ArmazenaDados;
import Objetos.ProdutosVendidos;

import java.util.Scanner;

public class ExibirRelatorios extends ArmazenaDados {

    public static void executar(Scanner sc){
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
                vendasCredito();
                break;
            case "3":
                vendasDebito();
                break;
            case "4":
                vendasPix();
            case "5":
                vendasDinheiro();
                break;
            case "6":
                vendasNaLoja();
                break;
            case "7":
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public static void vendasGerais(){
        for (ProdutosVendidos vendidos: listaVendidos) {
            System.out.println("Nome do cliente: " + vendidos.getCliente().getNome());
            System.out.println("Valor total da compra: R$ " + vendidos.getValorCompra());
            System.out.println("Metodo de pagamento: " + vendidos.getMetodoPagamento());
            System.out.println("-----------------------------------------");
            System.out.println();
        }
    }

    public static void vendasCredito(){
        for (ProdutosVendidos vendidos: listaVendidos) {
            if (vendidos.getMetodoPagamento().equals("Crédito")) {
                System.out.println("Nome do cliente: " + vendidos.getCliente().getNome());
                System.out.println("Valor total da compra: R$ " + vendidos.getValorCompra());
                System.out.println("Metodo de pagamento: " + vendidos.getMetodoPagamento());
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }
    public static void vendasDebito(){
        for (ProdutosVendidos vendidos: listaVendidos) {
            if (vendidos.getMetodoPagamento().equals("Débito")) {
                System.out.println("Nome do cliente: " + vendidos.getCliente().getNome());
                System.out.println("Valor total da compra: R$ " + vendidos.getValorCompra());
                System.out.println("Metodo de pagamento: " + vendidos.getMetodoPagamento());
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }

    public static void vendasDinheiro(){
        for (ProdutosVendidos vendidos: listaVendidos) {
            if (vendidos.getMetodoPagamento().equals("Dinheiro")) {
                System.out.println("Nome do cliente: " + vendidos.getCliente().getNome());
                System.out.println("Valor total da compra: R$ " + vendidos.getValorCompra());
                System.out.println("Metodo de pagamento: " + vendidos.getMetodoPagamento());
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }
    public static void vendasPix(){
        for (ProdutosVendidos vendidos: listaVendidos) {
            if (vendidos.getMetodoPagamento().equals("Pix")) {
                System.out.println("Nome do cliente: " + vendidos.getCliente().getNome());
                System.out.println("Valor total da compra: R$ " + vendidos.getValorCompra());
                System.out.println("Metodo de pagamento: " + vendidos.getMetodoPagamento());
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }
    public static void vendasNaLoja(){
        for (ProdutosVendidos vendidos: listaVendidos) {
            if (vendidos.getMetodoPagamento().equals("naLoja")) {
                System.out.println("Nome do cliente: " + vendidos.getCliente().getNome());
                System.out.println("Valor total da compra: R$ " + vendidos.getValorCompra());
                System.out.println("Metodo de pagamento: " + vendidos.getMetodoPagamento());
                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }

}
