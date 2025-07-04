import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que classifica a faixa etária de uma pessoa.");

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 12 && idade <= 17) {
            System.out.println("A sua faixa etária é: Adolescente");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("A sua faixa etária é: Jovem Adulto");
        } else if (idade >= 26 && idade <= 59) {
            System.out.println("A sua faixa etária é: Adulto");
        } else if (idade >= 60) {
            System.out.println("A sua faixa etária é: Idoso");
        } else {
            System.out.println("A sua faixa etária é: Criança");
        }
        
        scanner.close();
    }
}