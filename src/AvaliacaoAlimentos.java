import java.util.Scanner;

public class AvaliacaoAlimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a quantidade de alimentos: ");
        int quantidade = scanner.nextInt();


        double[] avaliacoes = new double[quantidade];


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


        double soma = 0;

        for (double nota : avaliacoes) {
            soma += nota;
        }

        double media = soma / quantidade;


        System.out.printf("A média das avaliações é: %.2f%n", media);


        if (media > 6) {
            System.out.println("Avaliação: Bom");
        } else {
            System.out.println("Avaliação: Ruim");
        }

        scanner.close();
    }
}
