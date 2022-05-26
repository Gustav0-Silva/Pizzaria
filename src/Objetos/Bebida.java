package Objetos;

import java.math.BigDecimal;

public class Bebida {

    private String nome;
    private BigDecimal valor;

    public Bebida(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }
}

