import java.util.Scanner;

public class Atv2_Boleto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double boleto1, boleto2, boleto3, boleto4, totalBoletos;

        System.out.println("Digite seus boletos (R$): ");
        boleto1 = sc.nextDouble();
        boleto2 = sc.nextDouble();
        boleto3 = sc.nextDouble();
        boleto4 = sc.nextDouble();

        totalBoletos = boleto1 + boleto2 + boleto3 + boleto4;

        System.out.printf("Seu total de boletos é: R$%.2f", totalBoletos);

        sc.close();

    }

}