package ActionUsuario.FinalizarPedidos;

import ActionUsuario.FinalizarPedidos.TiposPagamentos.PagamentoCredito;
import ActionUsuario.FinalizarPedidos.TiposPagamentos.PagamentoDebito;
import ActionUsuario.FinalizarPedidos.TiposPagamentos.PagamentoDinheiro;
import ActionUsuario.FinalizarPedidos.TiposPagamentos.PagamentoPix;

public enum TipoPagamento {

    DEBITO(1){
        Pagamento getInstance(){
            return new PagamentoDebito();
        }
    },
    CREDITO(2){
        Pagamento getInstance(){
            return new PagamentoCredito();
        }
    },
    PIX(3) {
        Pagamento getInstance() {
            return new PagamentoPix();
        }
    },
    DINHEIRO(4) {
        Pagamento getInstance() {
            return new PagamentoDinheiro();
        }
    };

    private int codigo;

    TipoPagamento(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static TipoPagamento fromCodigo(int codigo){

        for (TipoPagamento codigoTemp: TipoPagamento.values()) {
            if (codigoTemp.getCodigo() == codigo){
                return codigoTemp;
            }
        }
        return null;
    }
    abstract Pagamento getInstance();
}
