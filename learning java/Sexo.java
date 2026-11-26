import java.util.Scanner;

public class Sexo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu sexo(F-M): ");
        String Resposta = ler.nextLine();

        if (Resposta.equalsIgnoreCase("M")) { 
        // o equals tem uma ideia de equivalencia e vai ser usado em comparação de strings(caracteres). já o equalsIngnoreCase idependente do caracter ele le igual ,ou seja, caso for maiusculo ou minusculo ele le igual
            System.out.println("Masculino!");

        } else if (Resposta.equalsIgnoreCase("F")) {

            System.out.println("Feminino!");

        } else {

        System.out.println("Sexo inexistente!");

        }

    }
    
}
