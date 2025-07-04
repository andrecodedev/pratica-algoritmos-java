import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Programa para calcular o peso ideal.");

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade <= 18 || idade >= 65) {
            System.out.println("Você não pode calcular o peso ideal, pois está fora da faixa etária permitida (18 a 65 anos).");
        } else {
            System.out.println("Digite seu sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
                scanner.close();
                return; 
            }

            System.out.println("Digite seu peso atual em kg: ");
            double peso = scanner.nextDouble();
            System.out.println("Digite sua altura em metros (ex: 1.75): ");
            double altura = scanner.nextDouble();
            
            switch (sexo) {
                case 'M':
                    double pesoIdealM = (72.7 * altura) - 62;
                    System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdealM);
                    if (peso < pesoIdealM) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else if (peso > pesoIdealM) {
                        System.out.println("Você está acima do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    
                    break;
                case 'F':
                    double pesoIdealF = (62.1 * altura) - 48.7;
                    System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdealF);
                    if (peso < pesoIdealF) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else if (peso > pesoIdealF) {
                        System.out.println("Você está acima do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }

                    break;
                            
            }
        }

        scanner.close();
    }
}