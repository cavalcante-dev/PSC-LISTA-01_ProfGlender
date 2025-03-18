import java.util.Scanner;

public class Desafio_Extra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int valor; 

        System.out.println("Digite o valor inserido: ");
        valor = sc.nextInt();

        int [] notas = {100, 50, 20, 10, 5, 2, 1}; //Priorizando sempre o menor número de notas (Ordem Descrescente)

        for (int nota : notas) { // Inicio do loop
            int quantidadeNotas = valor / nota;
            if (quantidadeNotas > 0) { //Condição de encerramento
                System.out.println("Notas de R$ " + nota + ",00: " + quantidadeNotas);
                valor %= nota; //Calcula o que falta do troco para ser divido
            }
        }

        sc.close();

    }       
}
