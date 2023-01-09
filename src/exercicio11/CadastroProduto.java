package exercicio11;

public class CadastroProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.id = 245;
        p1.nome = "PC gamer";
        p1.descricao = "Desktop da pichau";
        p1.valor = 5500.50;

        Produto p2 = new Produto();
        p2.id = 12;
        p2.nome = "Moto G8 plus";
        p2.descricao = "Smartphone da Motorola";
        p2.valor = 1500.10;

        Produto p3 = new Produto();
        p3.id = 343;
        p3.nome = "Mouse gamer RGB";
        p3.descricao = "Mouse da Razer";
        p3.valor = 299.99;

        System.out.println("Produto 1:");
        System.out.println("ID: " + p1.id);
        System.out.println("nome:" + p1.nome);
        System.out.println("descrição: " + p1.descricao);
        System.out.println("valor:" + p1.valor);

        System.out.println("\nProduto 2:");
        System.out.println("ID: " + p2.id);
        System.out.println("nome:" + p2.nome);
        System.out.println("descrição: " + p2.descricao);
        System.out.println("valor:" + p2.valor);

        System.out.println("\nProduto 3:");
        System.out.println("ID: " + p3.id);
        System.out.println("nome:" + p3.nome);
        System.out.println("descrição: " + p3.descricao);
        System.out.println("valor:" + p3.valor);
    }

}
