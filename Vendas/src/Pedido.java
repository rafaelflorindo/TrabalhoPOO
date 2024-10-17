public class Pedido {
    private int numPedido;
    private Cliente cliente;

    public Pedido(Cliente cliente, int numPedido) {
        this.cliente = cliente;
        this.numPedido = numPedido;
    }

    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Pedido: " + numPedido);
    }
}
