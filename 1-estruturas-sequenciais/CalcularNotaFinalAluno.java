import java.util.Scanner;

public class CalcularNotaFinalAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula a nota final de um aluno, levando em consideração as provas teóricas e práticas.");

        System.out.println("Digite a nota da prova teórica 1: ");
        double teorica1 = scanner.nextDouble();
        System.out.println("Digite a nota da prova teórica 2: ");
        double teorica2 = scanner.nextDouble();
        System.out.println("Digite a nota da prova prática 1: ");
        double pratica1 = scanner.nextDouble();
        System.out.println("Digite a nota da prova prática 2: ");
        double pratica2 = scanner.nextDouble();

        double mediaTeorica = (teorica1 + teorica2) / 2;
        double mediaPratica = (pratica1 + pratica2) / 2;

        double notaFinal = (mediaTeorica * 0.6) + (mediaPratica * 0.4);
        System.out.println("A nota final do semestre é: " + notaFinal);

        scanner.close();
    }
}
