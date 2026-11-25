import java.util.Scanner;

public class at05 {

    public static void main(String[] args) {
        

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
       double n1 = ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = ler.nextDouble();
        System.out.println("A media do aluno foi igual a: " + (n1 + n2)/2);

    }



}
