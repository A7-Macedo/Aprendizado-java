import java.util.Scanner;

public class MaiorDoisNumeros {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double n1 = ler.nextDouble();
    System.out.println("Digite o segundo número: ");
    double n2 = ler.nextDouble();
    if (n1 > n2) {
        
        System.out.println("O primeiro é maior!");

    } 
    else if (n2 > n1) {
        
        System.out.println("O segundo é maior!");
        
    } else {

    System.out.println("Os dois são iguais!");

    }  



    
    }
    
}
