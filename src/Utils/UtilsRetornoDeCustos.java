package Utils;

import Objetos.ArmazenaDados;
import Objetos.Produto;

import java.math.BigDecimal;

public class UtilsRetornoDeCustos extends ArmazenaDados {
    public BigDecimal valorDaVenda() {
        BigDecimal valorTotal = BigDecimal.valueOf(0);
        for (Produto produto : pedidosTemp) {
            valorTotal = valorTotal.add(produto.getValor());
        }
        return valorTotal;
    }
}
