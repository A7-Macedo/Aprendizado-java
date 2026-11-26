import java.util.Scanner;

public class Turno {
    
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o turno desejado(M-T-N): ");
    String turno = ler.nextLine();

    if (turno.equalsIgnoreCase("M")) {
    System.out.println("Bom dia!");
    
    } else if (turno.equalsIgnoreCase("T")) {

        System.out.println("Boa tarde!");

    } else if (turno.equalsIgnoreCase("N")) {

        System.out.println("Boa Noite!");

    } else {

        System.out.println("Turno inexistente!");

    }

}

}