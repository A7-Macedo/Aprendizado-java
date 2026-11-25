import java.util.Scanner;

public class anoNascimento {
    
public static void main(String[] args) {
    
Scanner ler = new Scanner(System.in);
System.out.println("Digite seu nome: ");
String nome = ler.nextLine();
System.out.println("Digite seu ano de nascimento: ");
int ano = ler.nextInt();
ano = 2026 - ano;
System.out.println("olá " + nome + " você tem " + ano + " anos");

}

}
