package Telas;

import Factory.FactoryPedido;
import Utils.UtilsExibirListas;

import java.util.Scanner;

public class SolicitarDadosPedido {

    public void receberDados(Scanner sc, Enum tipo){
        UtilsExibirListas.imprimirProdutos(tipo);

        System.out.println("Digite o produto que deseja ou digite S para sair");
        String sabor = sc.nextLine();

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        boolean action = FactoryPedido.gerarPedido(sabor,tipo);

        if (action){
            return;
        }else {
            SolicitarDadosPedido pedir = new SolicitarDadosPedido();
            receberDados(sc,tipo);
        }

    }

}
