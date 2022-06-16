package Factory;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Objetos.ProdutosVendidos;

import java.math.BigDecimal;

public class FactoryVenda extends ArmazenaDados {

    public void adicionaVenda(Cliente cliente, String pagamento, BigDecimal valorCompra) {
        ProdutosVendidos vendido = new ProdutosVendidos(cliente, pedidosTemp, pagamento, valorCompra);
        listaVendidos.add(vendido);
    }
}
