
public class SistemaEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        // Adicionar produtos
        estoque.adicionar(new Produto(1, "Teclado", 5));
        estoque.adicionar(new Produto(2, "Mouse", 8));
        estoque.adicionar(new Produto(3, "Monitor", 3));

        System.out.println("Estoque atual:");
        estoque.listar();

        // Remover produto
        System.out.println("\nRemovendo produto com ID 2");
        estoque.remover(2);

        System.out.println("\nEstoque após remoção:");
        estoque.listar();
    }
}