import java.util.Scanner;

public class VotacaoTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] times = {"Taffismo Club", "Patinho Branquinho", "Lucas FC", "Sport Redes FC"};
        int[] votos = new int[times.length];

        System.out.println("Votação para escolher o time favorito:");
        System.out.println("1. Taffismo Club");
        System.out.println("2. Patinho Branquinho");
        System.out.println("3. Lucas FC");
        System.out.println("4. Sport Redes FC");


        System.out.print("Digite o número de votos: ");
        int quantidadeVotos = scanner.nextInt();


        for (int i = 0; i < quantidadeVotos; i++) {
            int voto;
            do {
                System.out.print("Vote no seu time (1-4): ");
                voto = scanner.nextInt();
            } while (voto < 1 || voto > 4);


            votos[voto - 1]++;
        }


        int vencedorIndex = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > votos[vencedorIndex]) {
                vencedorIndex = i;
            }
        }


        System.out.println("\nResultados da votação:");
        for (int i = 0; i < times.length; i++) {
            System.out.println(times[i] + ": " + votos[i] + " voto(s)");
        }


        System.out.println("O vencedor é: " + times[vencedorIndex] + " com " + votos[vencedorIndex] + " voto(s)!");

        scanner.close();
    }
}