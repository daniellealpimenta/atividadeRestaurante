import java.util.Arrays;
import java.util.Scanner;

public class Cliente {
    private int numero;
    private String[] nome;
    private String[] endereco;
    private String[] telefone;

    public void registrarCliente() {
        System.out.println("------Seja Bem Vindo!------");
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos CLientes serão?");
        this.numero = ler.nextInt();
        ler.nextLine();

        this.nome = new String[numero];
        this.endereco = new String[numero];
        this.telefone = new String[numero];

        for (int i = 0; i < numero; i++){
            System.out.println("-----Cliente " + (i + 1) + "-----");
            System.out.println("Qual o seu nome?");
            this.nome[i] = ler.nextLine();
            System.out.println("Qual o seu endereço?");
            this.endereco[i] = ler.nextLine();
            System.out.println("Qual o seu telefone?");
            this.telefone[i] = ler.nextLine();
        }
    }

    public void visualizarCliente() {
        for (int i = 0; i < numero; i++){
            System.out.println("------Informações do CLiente " + nome[i] +"!------");
            System.out.println("Nome: " + nome[i]);
            System.out.println("Endereço: " + endereco[i]);
            System.out.println("Telefone: " + telefone[i]);
        }

    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.registrarCliente();
        cliente1.visualizarCliente();
    }
}
