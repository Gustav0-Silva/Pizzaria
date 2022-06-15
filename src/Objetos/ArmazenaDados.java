package Objetos;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public abstract class ArmazenaDados{

        protected static List<Produto> pedidosTemp = new ArrayList<>();
        protected static List<ProdutosVendidos> listaVendidos = new ArrayList<>();
        protected static List<Produto> listaProdutos = new ArrayList<>();
        public static Hashtable<String,Cliente> logins =new Hashtable<>();

}
