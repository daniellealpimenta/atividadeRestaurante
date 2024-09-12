import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    static ItemMenu [] menu = new ItemMenu[5];

    private static int escolha;
    public static void main(String[] args) throws InterruptedException {
        menu[0] = new ItemMenu("Lasanha", "Massa", 35.00);
        menu[1] = new ItemMenu("Strogonoff", "Felicidade", 26.00);
        menu[2] = new ItemMenu("Hamburguer(podrão)", "Lanche", 25.00);
        menu[3] = new ItemMenu("Banana Split", "Sobremesa", 38.00);
        menu[4] = new ItemMenu("Petit Gataeu", "Sobremesa", 100.00);


        Scanner ler = new Scanner(System.in);
        Pedido pedido = new Pedido();

        while (escolha != 6){
            System.out.println("""
                ------ QUAL A SUA ESCOLHA? ------
                [1] - Cadastrar Cliente
                [2] - Verificar Menu
                [3] - Adicionar Item no Carrinho
                [4] - Verificar Carrinho
                [5] - Status do Pedido
                [6] - Finalizar
                """);
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    Cliente cliente = new Cliente();
                    cliente.registrarCliente();
                    cliente.visualizarCliente();
                    break;
                case 2:
                    for (int i = 0; i < menu.length; i++){
                        System.out.println(""+ (i + 1) + "- " + menu[i]);
                    }
                    break;
                case 3:
                    System.out.println("Qual o número do item que você deseja? ");
                    int num = ler.nextInt();
                    pedido.adicionarItem(menu[num - 1]);
                    break;
                case 4:
                    for (int i = 0; i < pedido.getTotal(); i++){
                            pedido.mostrarCarrinho(i);
                        }
                    break;
                case 5:
                    pedido.atualizarStatus("Estamos Separando Seu Pedido");
                    Thread.sleep(2000);
                    pedido.atualizarStatus("Seu Pedido Está em Produção");
                    Thread.sleep(5000);
                    pedido.atualizarStatus("Seu Pedido Está Pronto!");
                    break;
                case 6:
                    System.out.println("Até a próxima!");
                    System.exit(0);
            }
        }

    }

}
