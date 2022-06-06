package Objetos;

import java.math.BigDecimal;

public class Produto extends ArmazenaDados {

    protected String nome;
    protected String descricao;
    protected BigDecimal valor;

    public Produto(String nome, String descricao, BigDecimal valor) {
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

    public Produto() {
    }
}
