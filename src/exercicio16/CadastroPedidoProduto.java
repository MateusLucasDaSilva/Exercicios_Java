package exercicio16;

import java.util.ArrayList;
import java.util.Date;

public class CadastroPedidoProduto {

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

        Pedido pe1 = new Pedido();
        pe1.setId(25);
        pe1.setValorFrete(28.99);
        pe1.setValorDesconto(2.00);
        pe1.setValorCupom(4.00);
        pe1.setValorTotal(22.99);
        pe1.setData(new Date());
        pe1.setProdutos(listaDeProdutos);
      

        System.out.println("ID do pedido: " + pe1.getId());
        System.out.println("Valor de Frente: " + pe1.getValorFrete());
        System.out.println("Valor de desconto: " + pe1.getValorDesconto());
        System.out.println("Valor do Cupom: " + pe1.getValorCupom());
        System.out.println("Valor Total do Pedido: " + pe1.getValorTotal());
        System.out.println("Data do Pedido: " + pe1.getData());
        System.out.println("______________________________________________________");

        for (Produto p : pe1.getProdutos()) {
            System.out.println("ID do Produto: " + p.getId());
            System.out.println("Nome do Produto: " + p.getNome());
            System.out.println("Descrição do Produto: " + p.getDescricao());
            System.out.println("Código de Barras do Produto: " + p.getCodigoBarras());
            System.out.println("Valor do Produto: " + p.getValor());
            System.out.println("______________________________________________________");
        }

    }
}
