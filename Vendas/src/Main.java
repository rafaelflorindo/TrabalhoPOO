import java.util.ArrayList;
/*
- Encontre o erro e faça a correção
- Construa um menu para melhorar a aplicação
- Seria ideal que cada cliente, produdo e pedido tivessem um codigo único
- Possibilitar o cancelamento do item do Produto, voltando o produto para o estoque
- Possibilitar o cancelamento da venda, voltando o produto para o estoque
*/
 
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Rafael", "123");
        Cliente cliente2 = new Cliente("Ricardo", "123");

        Produto produto1 = new Produto("CD", 1.80, 18);
        Produto produto2 = new Produto("DVD", 2.80, 15);

        Pedido pedido1 = new Pedido(cliente1, 4);
        Pedido pedido2 = new Pedido(cliente2, 10);

        ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();

        ItemPedido item = new ItemPedido();

        if(item.ItensPedido(pedido1, produto1, 2, produto1.getPrecoProduto()+0.05)){
            itens.add(item);
            System.out.println("Produto Inserido com sucesso!");
        }else {
            System.out.println("Quantidade Insuficiente do produto!");
        }

        if(item.ItensPedido(pedido2, produto1, 4, produto1.getPrecoProduto()+0.05)){
            itens.add(item);
            System.out.println("Produto Inserido com sucesso!");
        }else {
            System.out.println("Quantidade Insuficiente do produto!");
        }

        if(item.ItensPedido(pedido1, produto2, 5, produto1.getPrecoProduto()+0.05)){
            itens.add(item);
            System.out.println("Produto Inserido com sucesso!");
        }else {
            System.out.println("Quantidade Insuficiente do produto!");
        }

        for (ItemPedido iten : itens) {
            iten.mostrarItemPedido();
            System.out.println("--------------");
        }

    }
}