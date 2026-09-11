import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;
        String cidade;

        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua cidade: ");
        cidade = scanner.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Ola, " + nome + "! \n Você tem " + idade + " anos e mora em " + cidade + ".");

        scanner.close();
    }
}