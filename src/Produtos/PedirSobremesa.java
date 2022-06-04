package Produtos;

import Objetos.*;

import java.util.Scanner;

public class PedirSobremesa extends ArmazenaDados {
    public static void pedirSobremesa(){

        Scanner scanner = new Scanner(System.in);

        imprimirProdutos(TiposProdutos.SOBREMESA);
        System.out.println("Digite a sobremesa que deseja ou s para sair");
        String sabor = scanner.nextLine();

        if (sabor.equalsIgnoreCase("s")){
            return;
        }

        for (Sobremesa sobremesa : listaSobremesas) {
            if (sobremesa.getNome().equalsIgnoreCase(sabor)) {
                Pedido pedido = new Pedido(sobremesa.getNome(), sobremesa.getValor());
                pedidosTemp.add(pedido);
            }
        }

    }
}
