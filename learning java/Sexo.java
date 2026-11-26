import java.util.Scanner;

public class Sexo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu sexo(F-M): ");
        String Resposta = ler.nextLine();

        if (Resposta.equalsIgnoreCase("M")) {

            System.out.println("Masculino!");

        } else if (Resposta.equalsIgnoreCase("F")) {

            System.out.println("Feminino!");

        } else {

        System.out.println("Sexo inexistente!");

        }

    }
    
}
