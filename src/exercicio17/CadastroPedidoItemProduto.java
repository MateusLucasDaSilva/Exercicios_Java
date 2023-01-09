package exercicio17;

import java.util.ArrayList;
import java.util.Date;

public class CadastroPedidoItemProduto {

    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("It! Guaraná");
        p1.setDescricao("2 Litro do Mais puro Guaraná");
        p1.setCodigoBarras("o1o111oo1");
        p1.setValor(5.99);

        Produto p2 = new Produto();
        p2.setId(2);
        p2.setNome("Vintage T9");
        p2.setDescricao("Máquina de cortar cabelo");
        p2.setCodigoBarras("11101010");
        p2.setValor(128.99);

        Produto p3 = new Produto();
        p3.setId(3);
        p3.setNome("Rexona Men");
        p3.setDescricao("Antitranspirante aerosol 72 horas ");
        p3.setCodigoBarras("001101001");
        p3.setValor(12.30);

        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);

        ArrayList<Item> listaDeItens = new ArrayList<>();

        Item it1 = new Item();
        it1.setId(78);
        it1.setQuantidade(1);
        it1.setSubTotal(53);
        it1.setProduto(p1);

        Item it2 = new Item();
        it2.setId(79);
        it2.setQuantidade(2);
        it2.setSubTotal(35);
        it2.setProduto(p2);

        Item it3 = new Item();
        it3.setId(80);
        it3.setQuantidade(3);
        it3.setSubTotal(43);
        it3.setProduto(p3);

        listaDeItens.add(it1);
        listaDeItens.add(it2);
        listaDeItens.add(it3);

        Pedido pe1 = new Pedido();
        pe1.setId(25);
        pe1.setValorFrete(28.99);
        pe1.setValorDesconto(2.00);
        pe1.setValorCupom(4.00);
        pe1.setValorTotal(22.99);
        pe1.setData(new Date());
        pe1.setItens(listaDeItens);

        it1.setPedido(pe1);
        it2.setPedido(pe1);
        it3.setPedido(pe1);

        System.out.println("ID do pedido: " + pe1.getId());
        System.out.println("Valor de Frente: " + pe1.getValorFrete());
        System.out.println("Valor de desconto: " + pe1.getValorDesconto());
        System.out.println("Valor do Cupom: " + pe1.getValorCupom());
        System.out.println("Valor Total do Pedido: " + pe1.getValorTotal());
        System.out.println("Data do Pedido: " + pe1.getData());
        System.out.println("______________________________________________________");

        for (Item it : pe1.getItens()) {
            System.out.println("ID do Produto: " + it.getId());
            System.out.println("Quantidade de itens: " + it.getQuantidade());
            System.out.println("SubTotal: " + it.getSubTotal());
            System.out.println("ID do Produto: " + it.getProduto().getId());
            System.out.println("Nome do Produto: " + it.getProduto().getNome());
            System.out.println("Valor do Produto: " + it.getProduto().getValor());
            System.out.println("Código de Barras do Produto: " + it.getProduto().getCodigoBarras());
            System.out.println("Descrição do Produto: " + it.getProduto().getDescricao());

            System.out.println("______________________________________________________");
        }

    }
}
