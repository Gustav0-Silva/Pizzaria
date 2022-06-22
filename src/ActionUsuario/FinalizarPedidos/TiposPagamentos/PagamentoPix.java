package ActionUsuario.FinalizarPedidos.TiposPagamentos;

import ActionUsuario.FinalizarPedidos.Pagamento;

public class PagamentoPix implements Pagamento {

    public String pagar(){

        System.out.println();
        System.out.println("Nossa chave pix: 000.000.0091-10");
        System.out.println("Nome: Thomas Antonelli Olmos Delgado");
        System.out.println("Banco: Sinqia Bank S/A");
        System.out.println();
        System.out.println("O pedido ficará disponível após a confirmação do pagamento");
        System.out.println();
        return "Pix";
    }
}
