package Utils;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Objetos.Produto;

import java.util.Map;

public class UtilsConfirmaSeExiste extends ArmazenaDados {

    public Produto isValidProduto(String idProduto, Enum tipo) {
        for (Produto produto : listaProdutos) {
            if (produto.getTipo().equals(tipo) && produto.getNome().equalsIgnoreCase(idProduto)) {
                return produto;
            }
        }
        if (idProduto.matches(("[0-9]+"))) {
            for (Produto produto : listaProdutos) {
                if (produto.getTipo().equals(tipo) && listaProdutos.indexOf(produto) == Integer.parseInt(idProduto)) {
                    return produto;
                }
            }
        }
        return null;
    }

    public static Cliente clienteExiste(String login) {
        return logins.get(login);
    }
}
