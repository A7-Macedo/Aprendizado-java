import java.util.Scanner;

public class folhaPagamentoSimples2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nome do funcionario: ");
        String nome = ler.nextLine();
        System.out.print("Digite quanto você ganha por hora: ");
        float ganhoHora = ler.nextFloat();
        System.out.print("Quantas horas você trabalha no mês: ");
        float horaMes = ler.nextFloat();
        double salarioBruto = ganhoHora * horaMes;
        if (salarioBruto <= 900) {
            double sindicato = salarioBruto * 0.03;
            double Fgts = salarioBruto * 0.11;
            double inss = salarioBruto * 0.10;
            double totalDes = (inss + sindicato);
            double salarioLiq = salarioBruto - totalDes;
            System.out.println("Você gastou R$: " + inss + " de inss");
            System.out.println("Você está isento de imposto de renda");
            System.out.println("Você gastou R$: " + Fgts + " de fgts");
            System.out.println("o gasto total dos descontos foi de: R$: " + totalDes);
            System.out.println("O salario Bruto foi de: R$: " + salarioBruto);
            System.out.println("O salario Liquido foi de: R$: " + salarioLiq);

        } else if (salarioBruto > 900 & salarioBruto <= 1500) {

            double sindicato = salarioBruto * 0.03;
            double Fgts = salarioBruto * 0.11;
            double inss = salarioBruto * 0.10;
            double ir = salarioBruto * 0.05;
            double totalDes = (inss + ir);
            double salarioLiq = salarioBruto - totalDes;
            System.out.println("Você gastou R$: " + inss + " de inss");
            System.out.println("Você gastou R$: " + ir + " de Imposto de renda");
            System.out.println("Você gastou R$: " + Fgts + " de fgts");
            System.out.println("o gasto total dos descontos foi de: R$: " + totalDes);
            System.out.println("O salario Bruto foi de: R$: " + salarioBruto);
            System.out.println("O salario Liquido foi de: R$: " + salarioLiq);

        } else if (salarioBruto > 1500 & salarioBruto <= 2500) {

            double sindicato = salarioBruto * 0.03;
            double Fgts = salarioBruto * 0.11;
            double inss = salarioBruto * 0.10;
            double ir = salarioBruto * 0.10;
            double totalDes = (inss + sindicato + ir);
            double salarioLiq = salarioBruto - totalDes;
            System.out.println("Você gastou R$: " + inss + " de inss");
            System.out.println("Você gastou R$: " + ir + " de Imposto de renda");
            System.out.println("Você gastou R$: " + Fgts + " de fgts");
            System.out.println("o gasto total dos descontos foi de: R$: " + totalDes);
            System.out.println("O salario Bruto foi de: R$: " + salarioBruto);
            System.out.println("O salario Liquido foi de: R$: " + salarioLiq);

        } else if (salarioBruto > 2500) {

            double sindicato = salarioBruto * 0.03;
            double Fgts = salarioBruto * 0.11;
            double inss = salarioBruto * 0.10;
            double ir = salarioBruto * 0.20;
            double totalDes = (inss + ir);
            double salarioLiq = salarioBruto - totalDes;
            System.out.println("Você gastou R$: " + inss + "de inss");
            System.out.println("Você gastou R$: " + ir + "de Imposto de renda");
            System.out.println("Você gastou R$: " + Fgts + "de fgts");
            System.out.println("o gasto total dos descontos foi de: R$: " + totalDes);
            System.out.println("O salario Bruto foi de: R$: " + salarioBruto);
            System.out.println("O salario Liquido foi de: R$: " + salarioLiq);
        }
    }

}
