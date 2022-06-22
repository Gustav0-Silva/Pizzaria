package ActionUsuario.FinalizarPedidos.TiposPagamentos;

import ActionUsuario.FinalizarPedidos.Pagamento;

public class PagamentoDebito implements Pagamento {


    @Override
    public String pagar() {
        System.out.println();
        System.out.println("A maquininha será enviada até você");
        System.out.println();
        return "Débito";
    }

}
