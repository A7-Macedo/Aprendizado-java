import java.util.Scanner;

public class exibirNumero {
    
public static void main(String[] args) {
    
double n;

Scanner ler = new Scanner (System.in);
System.out.print("Digite um número: "); // Para colocar o texto do lado deixe apenas print, ou seja, ( System.out.print(""); )
n = ler.nextDouble();
System.out.print("O seu número foi: " + n);
}

}
