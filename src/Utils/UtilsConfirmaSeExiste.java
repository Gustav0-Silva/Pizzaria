package Utils;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Objetos.Produto;

public class UtilsConfirmaSeExiste extends ArmazenaDados{

    public Produto produtoExisteNumero(int numeroProduto, Enum tipo){
        for (Produto produto: listaProdutos) {
            if (produto.getTipo().equals(tipo) && listaProdutos.indexOf(produto) == numeroProduto){
                return produto;
            }
        }
        return null;
    }

    public Produto produtoExisteNome(String nomeProduto, Enum tipo){
        for (Produto produto: listaProdutos) {
            if (produto.getTipo().equals(tipo) && produto.getNome().equals(nomeProduto)){
                return produto;
            }
        }
        return null;
    }

    public static Cliente clienteExiste(String login) {
        for(Cliente cliente : listaClientes) {
            if(cliente.getLogin().equals(login)) {
                return cliente;
            }
        }
        return null;
    }



}
