package Objetos;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private String descricao;
    private BigDecimal valor;

    private Enum tipo;

    public Produto(String nome, String descricao, BigDecimal valor, Enum tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
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

    public Enum getTipo(){
        return tipo;
    }

    public Produto() {
    }
}
