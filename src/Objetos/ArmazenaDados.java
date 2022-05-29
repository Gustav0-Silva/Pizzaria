package Objetos;

import java.util.ArrayList;
import java.util.List;

public class ArmazenaDados {

        protected static List<Cliente> listaClientes = new ArrayList<>();
        protected static List<Bebida> listaBebidas = new ArrayList<>();
        protected static List<Pizza> listaPizzas = new ArrayList<>();
        protected static List<Sobremesa> listaSobremesas = new ArrayList<>();
        protected static List <Pedido> pedidosTemp = new ArrayList<>();
        protected static ArrayList <String> bairros = new ArrayList<>();


        public static void criarBairros(){
                bairros.add("vila formosa");
        }

        public static void imprimirBairros(){
                for (int i = 0; i < bairros.size(); i++) {
                        System.out.println(bairros.get(i));
                }
        }
}
