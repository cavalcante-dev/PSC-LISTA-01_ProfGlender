import java.util.Scanner;

public class Atv3_Segundos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double segundosAno;
        int bissexto, anos, diasFinal, anosDias, bissextoDias;

        System.out.println("Digite uma quantidade de anos para o calculo dos segundos: ");
        anos = sc.nextInt();

        anosDias = anos * 365;
        bissexto = anos % 3;

        for (bissextoDias = 0; bissexto != 0;) {
            bissextoDias += 1;
            bissexto %= anos / 3;
        }

        diasFinal = anosDias + bissextoDias;


        System.out.println("Teste dias (sem for) = " + anosDias);
        System.out.println("Teste dias (com for) = " + diasFinal);

        sc.close();
    }

}
