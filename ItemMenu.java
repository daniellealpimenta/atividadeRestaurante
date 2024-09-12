public class ItemMenu {
    private  String nome ;
    private String categoria;
    private double preco ;

    public ItemMenu(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return nome + " | " + categoria + " | R$" + preco;
    }
}

