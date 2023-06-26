package n1ejercicio1;

public class Main {

    public static void main(String[] args) {

        Undo undo = Undo.getInstance();

        undo.agregarPedido("Pedido 1");
        undo.agregarPedido("Pedido 2");
        undo.agregarPedido("Pedido 3");

        undo.listarPedidos();

        undo.eliminarUltimoPedido();

        undo.listarPedidos();

    }
}
