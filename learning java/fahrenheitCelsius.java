import java.util.Scanner;

public class fahrenheitCelsius {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em fahrenheit: ");
        double f = ler.nextDouble();
        double c = 5 * ((f-32) / 9);
        System.out.println("A temperatura em celsius é igual a: " + c);

    }
    
}
