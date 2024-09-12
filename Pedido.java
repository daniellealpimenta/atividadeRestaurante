import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemMenu> itens;
    private Cliente cliente;
    private double total;
    private String status;

    public Pedido() {
        this.itens = new ArrayList<>(); // Inicializa a lista de itens
        this.total = 0.0; // Inicializa o total com 0
        this.status = ""; // Inicializa o status com uma string vazia
    }

    public void adicionarItem(ItemMenu item){
        itens.add(item);
        total++;
    }

    public void mostrarCarrinho(int i){
        System.out.println("" + itens.get(i));
    }

    public double calcularTotal(){
        return total;
    }

    public void atualizarStatus(String novoStatus){
        System.out.println(this.status = novoStatus);
    }

    public double getTotal() {
        return total;
    }
}
