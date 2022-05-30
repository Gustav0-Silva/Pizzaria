package Objetos;

import java.math.BigDecimal;

public class Pedido {

    protected String nomeProduto;
    protected BigDecimal valor;
    protected int quantidade;

    public Pedido(String nomeProduto, BigDecimal valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        //this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
