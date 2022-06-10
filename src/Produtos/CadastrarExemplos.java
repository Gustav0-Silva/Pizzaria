package Produtos;

import Objetos.*;

import java.math.BigDecimal;

public class CadastrarExemplos extends ArmazenaDados {

    public static void cadastrarAdmin(){
        Cliente cliente = new Cliente("", "admin", "admin", "",0, "");
        listaClientes.add(cliente);
    }
    public static void cadastrarBebida(){
        Bebida bebida = new Bebida("Coca-Cola", "Lata 350ml",BigDecimal.valueOf(5));
        listaProdutos.add(bebida);
        bebida = new Bebida("Fanta", "Lata 350ml", BigDecimal.valueOf(5));
        listaProdutos.add(bebida);
        bebida = new Bebida("Sprite", "Lata 350ml", BigDecimal.valueOf(5));
        listaProdutos.add(bebida);
    }
    public static void cadastrarPizza(){
        Pizza pizza = new Pizza("ALHO E ÓLEO", "Mussarela e alho frito", BigDecimal.valueOf(30));
        listaProdutos.add(pizza);
        pizza = new Pizza("5 QUEIJOS", "Mussarela, provolone, parmesão gorgonzola e queijo tipo catupiry", BigDecimal.valueOf(30));
        listaProdutos.add(pizza);
        pizza = new Pizza("LOMBO E CHAMPIGNON", "Mussarela, lombo e champignon", BigDecimal.valueOf(30));
        listaProdutos.add(pizza);

    }
    public static void cadastrarSobremesa(){
        Sobremesa sobremesa = new Sobremesa("MINEIRO DE BOTAS", "Mussarela, banana, fatias de goiabada, açúcar e canela",BigDecimal.valueOf(20) );
        listaProdutos.add(sobremesa);
        sobremesa = new Sobremesa("CARTOLA", "Mussarela, banana, açúcar e canela",BigDecimal.valueOf(20) );
        listaProdutos.add(sobremesa);
        sobremesa = new Sobremesa("GOIABADA", "Doce de leite, mussarela e fatias de goiabada",BigDecimal.valueOf(20) );
        listaProdutos.add(sobremesa);

    }

    public static void cadastrarCliente(){
        Cliente cliente = new Cliente("Gustavo","gSilva","123","Rua Joao Jose", 2,"987955585");
        listaClientes.add(cliente);
    }

    public static void cadastrarExemplos(){
        cadastrarCliente();
        cadastrarPizza();
        cadastrarBebida();
        cadastrarSobremesa();
        cadastrarAdmin();
        cadastrarVenda();
    }

    public static void cadastrarVenda(){
        Pizza pizza = (Pizza) listaProdutos.get(0);
        Bebida bebida = (Bebida) listaProdutos.get(5);
        Cliente cliente = listaClientes.get(0);
        pedidosTemp.add(pizza);
        pedidosTemp.add(bebida);
        ProdutosVendidos vendidos = new ProdutosVendidos(cliente,pedidosTemp,"Débito",BigDecimal.valueOf(35));
        listaVendidos.add(vendidos);
        pedidosTemp.clear();

        pizza = (Pizza) listaProdutos.get(1);
        bebida = (Bebida) listaProdutos.get(4);
        cliente = listaClientes.get(0);
        pedidosTemp.add(pizza);
        pedidosTemp.add(bebida);
        vendidos = new ProdutosVendidos(cliente,pedidosTemp,"Débito",BigDecimal.valueOf(35));
        listaVendidos.add(vendidos);
        pedidosTemp.clear();

    }

}
