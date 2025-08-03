
class Produto {
	    protected int id;
	    protected String nome;
	    protected int quantidade;

	    public Produto(int id, String nome, int quantidade) {
	        this.id = id;
	        this.nome = nome;
	        this.quantidade = quantidade;
	    }

	    public String toString() {
	        return "ID: " + id + ", Nome: " + nome + ", Quantidade: " + quantidade;
	    }
	}
	
	


