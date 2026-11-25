import java.util.Scanner;

public class Cm {
    
public static void main(String[] args) {
    
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite a quantidade de metros que deseja transformar: ");
    double m = ler.nextDouble();
    double cm = (m * 100);
    System.out.println("A quantidade de cm é igual a: " + cm);
}

}
