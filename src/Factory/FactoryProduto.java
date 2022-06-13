package Factory;

import Objetos.ArmazenaDados;
import Objetos.Produto;

import java.math.BigDecimal;

public class FactoryProduto extends ArmazenaDados {

    public void criarProduto(String nome, String descricao, BigDecimal valor, Enum tipo){
        Produto produto = new Produto(nome, descricao, valor, tipo);
        listaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
        System.out.println();

    }
}
