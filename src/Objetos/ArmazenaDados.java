package Objetos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArmazenaDados<T> {

        protected static List<Cliente> listaClientes = new ArrayList<>();
        protected static List<Bebida> listaBebidas = new ArrayList<>();
        protected static List<Pizza> listaPizzas = new ArrayList<>();
        protected static List<Sobremesa> listaSobremesas = new ArrayList<>();
        protected static List<Pedido> pedidosTemp = new ArrayList<>();
        protected static List<ProdutosVendidos> listaVendidos = new ArrayList<>();
        protected static ArrayList<String> bairros = new ArrayList<>();

        protected static List<Produto> listaProdutos = new ArrayList<>();


        protected static void criarBairros() {
                bairros.add("vila formosa");
        }

        public static void imprimirBairros() {
                for (int i = 0; i < bairros.size(); i++) {
                        System.out.println(bairros.get(i));
                }
        }

        public static Produto pedidoExiste(Enum tipo){
                for (Produto produto: listaProdutos) {
                        if (produto.tipo.equals(tipo)){
                                return produto;
                        }
                }
                return null;
        }

        public static void imprimirProdutos(Enum tipo){
                for (Produto produto: listaProdutos) {
                        if (produto.tipo.equals(tipo)){
                                System.out.println("Nome: " + produto.nome);
                                System.out.println("Descição: " + produto.descricao);
                                System.out.println("Valor: " + produto.valor);
                                System.out.println("-----------------------------");
                        }
                }
        }


        public static BigDecimal valorDaVenda() {
                BigDecimal valorTotal = BigDecimal.valueOf(0);
                for (Pedido pedido : pedidosTemp) {
                        valorTotal = valorTotal.add(pedido.getValor());
                }
                return valorTotal;
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
