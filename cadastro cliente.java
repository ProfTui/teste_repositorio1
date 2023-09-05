import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cliente {
    private String nome;
    private int idade;
    private String email;

    public Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }
}

public class CadastroCliente {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Cadastro de Clientes -----");
            System.out.println("1 - Cadastrar novo cliente");
            System.out.println("2 - Exibir todos os clientes");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            if (opcao == 1) {
                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a idade do cliente: ");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do teclado

                System.out.print("Digite o email do cliente: ");
                String email = scanner.nextLine();

                Cliente cliente = new Cliente(nome, idade, email);
                clientes.add(cliente);
                System.out.println("Cliente cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("----- Lista de Clientes -----");
                if (clientes.isEmpty()) {
                    System.out.println("Nenhum cliente cadastrado.");
                } else {
                    for (Cliente cliente : clientes) {
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("Idade: " + cliente.getIdade());
                        System.out.println("Email: " + cliente.getEmail());
                        System.out.println("-----------------------------");
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                break;

            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

            System.out.println();
        }

        scanner.close();
    }
}

