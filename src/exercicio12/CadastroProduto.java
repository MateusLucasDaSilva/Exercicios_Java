package exercicio12;

public class CadastroProduto {

    public static void main(String[] args) {
        Produtos p1 = new Produtos();
        p1.setId(245);
        p1.setNome("PC gamer");
        p1.setDescricao("Desktop da pichau");
        p1.setValor(5500.50);

        Produtos p2 = new Produtos();
        p2.setId(12);
        p2.setNome("Moto G8 plus");
        p2.setDescricao("Smartphone da Motorola");
        p2.setValor(1500.10);

        Produtos p3 = new Produtos();
        p3.setId(343);
        p3.setNome("Mouse gamer RGB");
        p3.setDescricao("Mouse da Razer");
        p3.setValor(299.99);

        System.out.println("Produto 1:");
        System.out.println("Id:" + p1.getId());
        System.out.println("nome:" + p1.getNome());
        System.out.println("descrição: " + p1.getDescricao());
        System.out.println("valor:" + p1.getValor());

        System.out.println("\nProduto 2:");
        System.out.println("ID: " + p2.getId());
        System.out.println("nome:" + p2.getNome());
        System.out.println("descrição: " + p2.getDescricao());
        System.out.println("valor:" + p2.getValor());

        System.out.println("\nProduto 3:");
        System.out.println("ID: " + p3.getId());
        System.out.println("nome:" + p3.getNome());
        System.out.println("descrição: " + p3.getDescricao());
        System.out.println("valor:" + p3.getValor());
    }
}
