package Factory;

import Objetos.ArmazenaDados;
import Objetos.Produto;
public class FactoryPedido extends ArmazenaDados {

    public static boolean gerarPedido(String sabor, Enum tipo){
        if (sabor.matches("[0-9]+")) {
            for (Produto produto: listaProdutos) {
                if (produto.getTipo().equals(tipo) && listaProdutos.indexOf(produto) == Integer.parseInt(sabor)){
                    FactoryPedido.addGerarPedido(produto);
                    return true;
                }
            }

        } else {
            for (Produto produto: listaProdutos) {
                if (produto.getTipo().equals(tipo) && produto.getNome().equals(sabor)){
                    FactoryPedido.addGerarPedido(produto);
                    return true;
                }
            }

        }
        System.out.println("Número informado não consta no menu, tente novamente");
        return false;
    }

    public static void addGerarPedido (Produto produto){
        Produto produtoPedido = new Produto(produto.getNome(), produto.getDescricao(), produto.getValor(),produto.getTipo());
        pedidosTemp.add(produtoPedido);
        System.out.println("Pedido adicionado com sucesso");
        System.out.println();
    }

}

