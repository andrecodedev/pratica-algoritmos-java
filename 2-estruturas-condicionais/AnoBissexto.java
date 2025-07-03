import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que verifica se um ano é bissexto ou não.");

        System.out.println("Informe o ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("O ano " + ano + " é bissexto.");
        }else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        scanner.close();
    }
}
