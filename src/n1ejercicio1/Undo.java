package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private final List<String> pedidos;
    private static Undo instance;

    private Undo() {
        pedidos = new ArrayList<>();
    }

    public synchronized static Undo getInstance() {
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void agregarPedido(String pedido) {
        pedidos.add(pedido);
    }

    public void eliminarUltimoPedido() {
        if (!pedidos.isEmpty()) {
            pedidos.remove(pedidos.size() - 1);
        }
    }

    public void listarPedidos() {
        System.out.println("Ultimo pedidos introducidos:");
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

