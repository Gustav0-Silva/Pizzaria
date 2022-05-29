package Produtos;

import Objetos.ArmazenaDados;
import Objetos.Cliente;
import Objetos.Pedido;
import Objetos.Pizza;

import java.math.BigDecimal;
import java.util.Scanner;

public class PedirPizza extends ArmazenaDados {
    public static void pedirPizza() {

        Scanner scanner = new Scanner(System.in);
        //int quantidadeSabores = scanner.nextInt();
        String sabores = null;
        BigDecimal valores = BigDecimal.valueOf(0);

        //for (int i = 0; i < quantidadeSabores; i++) {

            CadastrarPizza.imprimir();
            System.out.println("Digite o sabor de pizza que deseja");
            String sabor = scanner.nextLine();

            for (Pizza pizza : listaPizzas) {
                if (pizza.getNome().equals(sabor)) {
                    Pedido pedido = new Pedido(pizza.getNome(), pizza.getValor());
                    pedidosTemp.add(pedido);
                }
            }
//            if (Pizza.(novoLogin) == null){
//                sabores = sabores + sabor;
//                Pizza.findPizza(valores).getValor();
//                if (valores.compareTo(Pizza.fi().getSenha()) == -1){
//                    valores = ();
//                }
//            }
//        }
//        for(Pizza pizza : listaPizzas) {
//            if(pizza.getNome().equals(sabor)) {
//              pedidosTemp.add()
//        BigDecimal valor = Pizza.getValor();
//        Pedido pedido = new Pedido(sabores, valores );
//        pedidosTemp.add(String.valueOf(pedido));
        }
    }
//}
