import java.util.Scanner;

public class situacaoAluno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        double n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double n2 = ler.nextDouble();
        double media = (n1 + n2) / 2;
        if (media == 10){

            System.out.println("Aprovado com destinção!");

        } else if (media >= 7) {

            System.out.println("Aprovado!");

        } else {

            System.out.println("Reprovado");

        }
    }
    
}
