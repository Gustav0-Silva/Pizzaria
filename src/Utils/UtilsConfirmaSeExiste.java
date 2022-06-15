package Utils;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Objetos.Produto;

import java.util.Map;

public class UtilsConfirmaSeExiste extends ArmazenaDados {

    public Produto produtoExisteNumero(int numeroProduto, Enum tipo) {
        for (Produto produto : listaProdutos) {
            if (produto.getTipo().equals(tipo) && listaProdutos.indexOf(produto) == numeroProduto) {
                return produto;
            }
        }
        return null;
    }

    public Produto produtoExisteNome(String nomeProduto, Enum tipo) {
        for (Produto produto : listaProdutos) {
            if (produto.getTipo().equals(tipo) && produto.getNome().equals(nomeProduto)) {
                return produto;
            }
        }
        return null;
    }


    public static Cliente clienteExiste(String login) {

        for (Map.Entry i : logins.entrySet()) {
            if (logins.containsValue(login)) {
            }
        }
        return logins.get(login);
    }
}
