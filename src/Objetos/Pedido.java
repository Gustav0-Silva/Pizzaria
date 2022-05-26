package Objetos;

import java.math.BigDecimal;

public class Pedido {

    protected static String nomeProduto;
    protected static BigDecimal valor;
    protected static int quantidade;

    public Pedido(String nomeProduto, BigDecimal valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public static String getNomeProduto() {
        return nomeProduto;
    }

    public static BigDecimal getValor() {
        return valor;
    }

    public static int getQuantidade() {
        return quantidade;
    }
}
