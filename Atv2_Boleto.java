import java.util.Scanner;

public class Atv2_Boleto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double boleto1, boleto2, boleto3, boleto4, totalBoletos, salarioLiquido, salarioFinal;

        System.out.println("Digite seus boletos (R$): ");
        boleto1 = sc.nextDouble();
        boleto2 = sc.nextDouble();
        boleto3 = sc.nextDouble();
        boleto4 = sc.nextDouble();

        System.out.println("Digite seu salário liquido (RS$): ");
        salarioLiquido = sc.nextDouble();

        totalBoletos = boleto1 + boleto2 + boleto3 + boleto4;
        salarioFinal = salarioLiquido - totalBoletos;

        System.out.printf("Seu total de boletos é: R$%.2f", totalBoletos);
        System.out.printf("\nSeu salário final é: R$%.2f", salarioFinal);

        sc.close();

    }

}