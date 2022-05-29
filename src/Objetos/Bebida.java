package Objetos;

import java.math.BigDecimal;

public class Bebida {

    private String bebida;
    private BigDecimal valorBebida;

    private String descricao;

    public Bebida(String bebida, BigDecimal valorBebida, String descricao) {
        this.bebida = bebida;
        this.valorBebida = valorBebida;
        this.descricao = descricao;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public BigDecimal getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(BigDecimal valorBebida) {
        this.valorBebida = valorBebida;
    }

    public String getDescrcao() {
        return descricao;
    }

    public void setDescrcao(String descrcao) {
        this.descricao = descrcao;
    }
}
