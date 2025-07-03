import java.util.Scanner;

public class MediaAluno2Provas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que recebe a nota 1 e 2 das provas do aluno e diz se foi aprovado se for 5, ou mostra quanto falta para atingir 5.");

        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        if (media >= 5) {
            System.out.println("Aprovado com média: " + media);
        }else {
            double notaFaltando = 5 - media;
            System.out.println("Reprovado com média: " + media + ". Faltou " + notaFaltando + " para ser aprovado.");
        }

        scanner.close();
    }
}