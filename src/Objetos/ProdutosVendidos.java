package Objetos;

import java.math.BigDecimal;
import java.util.List;

public class ProdutosVendidos {

    private Cliente cliente;
    private static List<Produto> listaPedidosFinal;
    private String metodoPagamento;
    private BigDecimal valorCompra;

    public ProdutosVendidos(Cliente cliente, List listaPedidosFinal, String metodoPagamento, BigDecimal valorCompra) {
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
        this.valorCompra = valorCompra;
        this.listaPedidosFinal = listaPedidosFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getListaPedidosFinal() {
        return listaPedidosFinal;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }
}
