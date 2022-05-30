package Objetos;

import java.math.BigDecimal;

public class Pizza {

    private String nome;
    private String descricao;
    private BigDecimal valor;

    public Pizza(String nome, String descricao, BigDecimal valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
