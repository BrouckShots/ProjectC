package funcionarios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaFuncionario {
    private Map<String, Funcionario> funcionarios = new HashMap<>();

    public void adicionarFuncionario() {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Nome:");
        funcionario.setNome(scanner.nextLine());

        System.out.println("Identificador:");
        funcionario.setIdentificador(scanner.nextLine());

        System.out.println("Alergias:");
        funcionario.setAlergias(scanner.nextLine());

        System.out.println("Problemas Médicos:");
        funcionario.setProblemasMedicos(scanner.nextLine());

        System.out.println("Telefone de Contato:");
        funcionario.setTelefoneContato(scanner.nextLine());

        System.out.println("Email de Contato:");
        funcionario.setEmailContato(scanner.nextLine());

        funcionarios.put(funcionario.getIdentificador(), funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
        
        scanner.close();    }
    

    public void exibirFuncionario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Identificador do funcionário:");
        String identificador = scanner.nextLine();

        Funcionario funcionario = funcionarios.get(identificador);
        if (funcionario != null) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Alergias: " + funcionario.getAlergias());
            System.out.println("Problemas Médicos: " + funcionario.getProblemasMedicos());
            System.out.println("Telefone de Contato: " + funcionario.getTelefoneContato());
            System.out.println("Email de Contato: " + funcionario.getEmailContato());
        } else {
            System.out.println("Funcionário não encontrado.");
            scanner.close();
        }
        }
            
            
            
    public static void main(String[] args) {
        SistemaFuncionario sistema = new SistemaFuncionario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Exibir Funcionário");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            if (opcao == 1) {
                sistema.adicionarFuncionario();
            } else if (opcao == 2) {
                sistema.exibirFuncionario();
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                scanner.close();
            }
        }
    }
}
