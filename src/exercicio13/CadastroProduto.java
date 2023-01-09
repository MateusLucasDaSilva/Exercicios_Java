package exercicio13;

public class CadastroProduto {

    public static void main(String[] args) {
        Produtos p1 = new Produtos(123, "mallorry", "Ventilador branco", "010011100", 299.40);

        Produtos p2 = new Produtos(124, " moto g8 plus", "celular motorola", "101001100", 1599.70);

        Produtos p3 = new Produtos(125, "fanta 2L", "refrigante de Laranja", "1010101011", 7.99);

        System.out.println("Produto 1:");
        System.out.println("Id:" + p1.getId());
        System.out.println("nome:" + p1.getNome());
        System.out.println("descrição: " + p1.getDescricao());
        System.out.println("codBarras: " + p1.getCodBarras());
        System.out.println("valor:" + p1.getValor());

        System.out.println("\nProduto 2:");
        System.out.println("ID: " + p2.getId());
        System.out.println("nome:" + p2.getNome());
        System.out.println("descrição: " + p2.getDescricao());
        System.out.println("codBarras: " + p2.getCodBarras());
        System.out.println("valor:" + p2.getValor());

        System.out.println("\nProduto 3:");
        System.out.println("ID: " + p3.getId());
        System.out.println("nome:" + p3.getNome());
        System.out.println("descrição: " + p3.getDescricao());
        System.out.println("codBarras: " + p3.getCodBarras());
        System.out.println("valor:" + p3.getValor());
    }

}
 