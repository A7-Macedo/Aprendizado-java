import java.util.Scanner;

public class produtoMaisBarato {
    
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Qual é o preço do primeiro produto: ");
    double v1 = ler.nextDouble();
    System.out.println("Qual é o preço do segundo: ");
    double v2 = ler.nextDouble();
    if (v1 > v2 ) {

        System.out.println("O produto primeiro é mais barato!");

    } else if (v2 > v1) {

        System.out.println("O segundo produto é mais barato!");

    } else {

        System.out.println("Os dois tem o mesmo preço!");

    }
}

}
