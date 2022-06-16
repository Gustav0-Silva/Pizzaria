package Factory;

import Objetos.ArmazenaDados;
import Objetos.Produto;
import Utils.UtilsConfirmaSeExiste;

public class FactoryPedido extends ArmazenaDados {

    public boolean gerarPedido(String sabor, Enum tipo){
        UtilsConfirmaSeExiste confirmaSeExiste = new UtilsConfirmaSeExiste();

        Produto produto = confirmaSeExiste.isValidProduto(sabor,tipo);

        if (produto == null){
            System.out.println("Número informado não consta no menu, tente novamente");
            return false;
        }else {
            FactoryPedido.addGerarPedido(produto);
            return true;
        }
    }

    private static void addGerarPedido (Produto produto){
        Produto produtoPedido = new Produto(produto.getNome(), produto.getDescricao(), produto.getValor(),produto.getTipo());
        pedidosTemp.add(produtoPedido);
        System.out.println("Pedido adicionado com sucesso");
        System.out.println();
    }

}

