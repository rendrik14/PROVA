import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        String[] tarefas = {"Limpar a casa", "Programar", "Correr", "Cozinhar", "Tomar banho"};

        while (opcao != 9) {
            System.out.println("Menu UNIPAR");
            System.out.println("1 - somar");
            System.out.println("2 - subtrair");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir");
            System.out.println("5 - contar");
            System.out.println("6 - Escolher tarefa");
            System.out.println("9 - sair");
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("informe um valor: ");
                int primeiroValor = sc.nextInt();

                System.out.println("informe outro valor: ");
                int segundoValor = sc.nextInt();

                int resultado = primeiroValor + segundoValor;
                System.out.println("Soma é: " + resultado);

            } else if (opcao == 5) {

                System.out.println("Até quanto você deseja contar");
                int contar = sc.nextInt();

                for (int i = 0; i < contar; i++) {
                    System.out.println(i);
                }
            } else if (opcao == 6) {
                int valorRandomico = (int) Math.random() * tarefas.length;
                System.out.println( tarefas[valorRandomico] );

            }
        }
    }
}