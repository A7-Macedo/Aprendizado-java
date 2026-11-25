import java.util.Scanner;

public class folhaPagamento {
    
public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite o nome do funcionario: ");
    String nome = ler.nextLine();
    System.out.print("Digite quanto você ganha por hora: ");
    float ganhoHora = ler.nextFloat();
    System.out.print("Quantas horas você trabalha no mês: ");
    float horaMes = ler.nextFloat();
    double salarioBruto = ganhoHora * horaMes;
    double inss = salarioBruto * 0.08;
    double ir = salarioBruto * 0.11;
    double sindicato = salarioBruto * 0.05;
    double totalDes = (ir + inss + sindicato);
    double salarioLiq = salarioBruto - totalDes;
    System.out.println("você gastou: R$: " + inss + " de inss!");
    System.out.println("você gastou: R$: " + ir + " de Imposto de Renda!");
    System.out.println("você gastou: R$: " + sindicato + " de sindicato!");
    System.out.println("o gasto total dos descontos foi de: R$: " + totalDes);
    System.out.println("O salario Bruto foi de: R$: " + salarioBruto);
    System.out.println("O salario Liquido foi de: R$: " + salarioLiq);
}

}
