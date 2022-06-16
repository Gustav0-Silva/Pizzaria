package Telas;

import Factory.FactoryPedido;
import Utils.UtilsExibirListas;

import java.util.Scanner;

public class SolicitarDadosPedido {

    public void receberDados(Scanner sc, Enum tipo){
        UtilsExibirListas.imprimirProdutos(tipo);
        FactoryPedido factoryPedido = new FactoryPedido();

        System.out.println("Digite o produto que deseja ou digite S para sair");
        String sabor = sc.nextLine();

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        boolean action = factoryPedido.gerarPedido(sabor,tipo);

        if (!action) {
            receberDados(sc, tipo);
        }

    }

}
