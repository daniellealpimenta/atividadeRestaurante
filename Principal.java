import java.awt.*;
import java.util.Scanner;

public class Principal {

    private static int escolha;
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        while (escolha != 6){
            System.out.println("""
                ------ QUAL A SUA ESCOLHA? ------
                [1] - Cadastrar Cliente
                [2] - Verificar Menu
                [3] - Adicionar Item no Carrinho
                [4] - Visualizar Carrinho
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Até a próxima!");
                    System.exit(0);
            }
        }

    }

}
