package exercicio15;

import java.util.ArrayList;

public class CadastroProduto {

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

        for (Produto p : listaDeProdutos) {
            System.out.println("ID do Produto: " + p.getId());
            System.out.println("Nome do Produto: " + p.getNome());
            System.out.println("Descrição do Produto: " + p.getDescricao());
            System.out.println("Código de Barras do Produto: " + p.getCodigoBarras());
            System.out.println("Valor do Produto: " + p.getValor());
            System.out.println("______________________________________________________");
        }

    }
}
