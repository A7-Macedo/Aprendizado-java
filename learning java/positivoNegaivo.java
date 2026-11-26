import java.util.Scanner;

public class positivoNegaivo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n = ler.nextDouble();
        if (n > 0) {

            System.out.println("Ele é positivo!");

        } else if (n < 0) {

            System.out.println("Ele é negativo!");

        } else {

            System.out.println("Ele é neutro!");

        }


    }
    
}
