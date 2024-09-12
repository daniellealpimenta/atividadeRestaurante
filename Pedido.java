import java.util.ArrayList;


public class Pedido {
    private ArrayList<ItemMenu> itens;
    private Cliente cliente;
    private double total;
    private String status;

    public Pedido(Cliente cliente) {
        this.itens = new ArrayList<>();
        this.cliente = cliente;
        this.total = 0.0;
        this.status = "Em preparação"; // Status inicial padrão
    }

    public void adicionarItem(ItemMenu item){
        itens.add(item);
        total += item.calcularPreco();
    }

    public double calcularTotal(){
        return total;
    }

    public void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }

}
