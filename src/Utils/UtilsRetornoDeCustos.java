package Utils;

import Objetos.ArmazenaDados;
import Objetos.Produto;

import java.math.BigDecimal;

public class UtilsRetornoDeCustos extends ArmazenaDados {
    public BigDecimal retornaCustoEntrega (int bairro){
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
    public BigDecimal valorDaVenda() {
        BigDecimal valorTotal = BigDecimal.valueOf(0);
        for (Produto produto : pedidosTemp) {
            valorTotal = valorTotal.add(produto.getValor());
        }
        return valorTotal;
    }
}
