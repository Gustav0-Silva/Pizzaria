package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Bebida;
import Objetos.Pedido;
import Objetos.Sobremesa;

import java.util.Scanner;

public class PedirSobremesa extends ArmazenaDados {
    public static void pedirSobremesa(){

        Scanner scanner = new Scanner(System.in);

        CadastrarSobremesa.imprimir();
        System.out.println("Digite a sobremesa que deseja");
        String sabor = scanner.nextLine();

        for (Sobremesa sobremesa : listaSobremesas) {
            if (sobremesa.getNome().equals(sabor)) {
                Pedido pedido = new Pedido(sobremesa.getNome(), sobremesa.getValor());
                pedidosTemp.add(pedido);
            }
        }

    }
}
