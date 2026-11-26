import java.util.Scanner;

public class conceitoAluno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        double n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double n2 = ler.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        double n3 = ler.nextDouble();
        System.out.println("Digite a quarta nota do aluno: ");
        double n4 = ler.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;
        if(media >= 6) {

            System.out.println("Aprovado");

        } else {

            System.out.println("Reprovado");

        }
    }

}
