package Soma;
import java.util.Scanner;

public class SomaMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obter entrada do usuário
        int N = scanner.nextInt();

        // Calcular a soma dos múltiplos de 3 ou 5
        int resultado = somaMultiplos3ou5(N);

        // Imprimir o resultado
        System.out.println(resultado);
        
        // Fechar o objeto Scanner
        scanner.close();
    }

    public static int somaMultiplos3ou5(int N) {
        int soma = 0;
        for (int i = 0; i < N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
