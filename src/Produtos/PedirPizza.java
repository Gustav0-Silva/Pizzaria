package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Pedido;
import Objetos.Pizza;

import java.math.BigDecimal;
import java.util.Scanner;

public class PedirPizza extends ArmazenaDados {
    public void pedirPizza(){
        Scanner scanner = new Scanner(System.in);
        int quantidadeSabores = scanner.nextInt();

        for (int i = 0; i < quantidadeSabores; i++) {

            System.out.println(listaPizzas);
            System.out.println("Digite o sabor de pizza que deseja");
            String sabor = scanner.next();

            if (listaPizzas.contains(sabor)){

                Pedido pedido = new Pedido(sabor );

            }
        }

    }
}
