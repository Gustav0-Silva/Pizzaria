package ActionUsuario.FinalizarPedidos;

import Factory.FactoryVenda;
import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Utils.UtilsConfirmaSeExiste;
import Utils.UtilsExibirListas;

import java.math.BigDecimal;
import java.util.Scanner;

public class FinalizarMain extends ArmazenaDados {

    public void finalizarPedido(Scanner scanner, String login){
        UtilsExibirListas.exibirTemp();
        Cliente cliente = UtilsConfirmaSeExiste.clienteExiste(login);

        FactoryVenda venda = new FactoryVenda();
        RetirarOuReceber retirarOuReceber = new RetirarOuReceber();
        SelecionarMetodoPagamento metodo = new SelecionarMetodoPagamento();

        BigDecimal valorComEntrega = retirarOuReceber.executar(scanner,cliente);

        if (valorComEntrega == null){
            return;
        }else {
            String pagamento = metodo.executar(scanner,valorComEntrega);
            venda.adicionaVenda(cliente,pagamento,valorComEntrega);
            pedidosTemp.clear();
        }

        System.out.println();
        System.out.println("Compra finalizada com sucesso, obrigado por comprar com a gente!");
        System.out.println();
    }
}
