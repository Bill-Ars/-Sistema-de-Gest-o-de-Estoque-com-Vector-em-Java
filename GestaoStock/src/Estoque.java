
import java.util.Vector;

class Estoque {
	
    private Vector<Produto> produtos = new Vector<>();

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public void remover(int id) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).id == id) {
                produtos.remove(i);
                break;
            }
        }
    }

    public void listar() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println(produtos.get(i));
            }
        }
    }
}
