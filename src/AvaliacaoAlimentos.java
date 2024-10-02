import java.util.Scanner;

public class AvaliacaoAlimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de alimentos
        System.out.print("Digite a quantidade de alimentos: ");
        int quantidade = scanner.nextInt();

        // Cria um vetor para armazenar as avaliações
        double[] avaliacoes = new double[quantidade];

        // Loop para solicitar as notas
        for (int i = 0; i < quantidade; i++) {
            double nota;
            do {
                System.out.print("Digite a nota do alimento " + (i + 1) + " (entre 0 e 10): ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            avaliacoes[i] = nota;
        }

        // Calcula a média das avaliações
        double soma = 0;

        for (double nota : avaliacoes) {
            soma += nota;
        }

        double media = soma / quantidade;

        // Exibe a média
        System.out.printf("A média das avaliações é: %.2f%n", media);

        // Verifica se a média é boa ou ruim
        if (media > 6) {
            System.out.println("Avaliação: Boa");
        } else {
            System.out.println("Avaliação: Ruim");
        }

        scanner.close();
    }
}
