package Objetos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArmazenaDados{

        protected static List<Cliente> listaClientes = new ArrayList<>();
        protected static List<Produto> pedidosTemp = new ArrayList<>();
        protected static List<ProdutosVendidos> listaVendidos = new ArrayList<>();
        protected static List<Produto> listaProdutos = new ArrayList<>();

        public static boolean ProdutoExisteNumero(int numeroProduto, String tipo){
                switch (tipo){
                        case "pizza":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Pizza && numeroProduto == listaProdutos.indexOf(produto)){
                                                return true;
                                        }
                                }
                                return false;
                        case "bebida":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Bebida && numeroProduto == listaProdutos.indexOf(produto)){
                                                return true;
                                        }
                                }
                                return false;
                        case "sobremesa":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Sobremesa && numeroProduto == listaProdutos.indexOf(produto)){
                                                return true;
                                        }
                                }
                                return false;
                }
                return false;
        }

        public static boolean produtoExisteNome(String nomeProduto, String tipo){
                switch (tipo){
                        case "pizza":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Pizza && produto.getNome().equalsIgnoreCase(nomeProduto)){
                                                return true;
                                        }
                                }
                                return false;
                        case "bebida":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Bebida && produto.getNome().equalsIgnoreCase(nomeProduto)){
                                                return true;
                                        }
                                }
                                return false;
                        case "sobremesa":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Sobremesa && produto.getNome().equalsIgnoreCase(nomeProduto)){
                                                return true;
                                        }
                                }
                                return false;
                }
                return false;
        }
        public static void excluirProduto(String nome){
                for (Produto produto: listaProdutos) {
                        if (produto.getNome().equalsIgnoreCase(nome)){
                                listaProdutos.remove(produto);
                                System.out.println("Produto removido com sucesso");
                                System.out.println();
                                return;
                        }
                }
        }

        public static BigDecimal valorDaVenda() {
                BigDecimal valorTotal = BigDecimal.valueOf(0);
                for (Produto produto : pedidosTemp) {
                        valorTotal = valorTotal.add(produto.getValor());
                }
                return valorTotal;
        }

        public static void imprimirProdutos(String item){
                System.out.println();

                switch (item){
                        case "pizza":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Pizza){
                                                System.out.println("Número: " + listaProdutos.indexOf(produto) );
                                                System.out.println("Nome: " + produto.getNome());
                                                System.out.println("Descrição: " + produto.getDescricao());
                                                System.out.println("Valor: R$ " + produto.getValor());
                                                System.out.println("--------------------------------------------");
                                        }
                                }
                                break;
                        case "bebida":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Bebida){
                                                System.out.println("Número: " + listaProdutos.indexOf(produto) );
                                                System.out.println("Nome: " + produto.getNome());
                                                System.out.println("Descrição: " + produto.getDescricao());
                                                System.out.println("Valor: R$ " + produto.getValor());
                                                System.out.println("--------------------------------------------");
                                        }
                                }
                                break;
                        case "sobremesa":
                                for (Produto produto: listaProdutos) {
                                        if (produto instanceof Sobremesa){
                                                System.out.println("Número: " + listaProdutos.indexOf(produto) );
                                                System.out.println("Nome: " + produto.getNome());
                                                System.out.println("Descrição: " + produto.getDescricao());
                                                System.out.println("Valor: R$ " + produto.getValor());
                                                System.out.println("--------------------------------------------");
                                        }
                                }
                                break;
                }



        }

        public static Cliente retornaCliente(String login) {
                for (Cliente cliente : listaClientes) {
                        if (login.equals(cliente.getLogin())) {
                                return cliente;
                        }
                }
                return null;
        }

        public static void adicionaVenda(Cliente cliente, String pagamento, BigDecimal valorCompra) {
                ProdutosVendidos vendido = new ProdutosVendidos(cliente, pedidosTemp, pagamento, valorCompra);
                listaVendidos.add(vendido);
        }


        public static String retornaNomeBairro(int bairro) {

                if (bairro == 1) {
                        return "Cidade Industrial";
                } else if (bairro == 2) {
                        return "Fazendinha";
                } else if (bairro == 3) {
                        return "Portão";
                } else if (bairro == 4) {
                        return "Cristo Rei";
                } else if (bairro == 5) {
                        return "Batel";
                }else{ return null;}
        }

        public static BigDecimal retornaCustoEntrega (int bairro){
                if (bairro == 1) {
                        return BigDecimal.valueOf(5);
                } else if (bairro == 2) {
                        return BigDecimal.valueOf(5);
                } else if (bairro == 3) {
                        return BigDecimal.valueOf(7);
                } else if (bairro == 4) {
                        return BigDecimal.valueOf(7);
                } else if (bairro == 5) {
                        return BigDecimal.valueOf(10);
                }else{ return null;}
        }
}
