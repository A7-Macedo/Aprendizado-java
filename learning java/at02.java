import java.util.Scanner; // import de funcionalidade do java. ele não vem programado, ele é puxado para o uso completo do codigo. 
// * em java/SQL significa tudo
public class at02 {

    public static void main(String[] args) {
        
     String nome = "arthur"; // String = caractere   
    int matricula = 1; // int = inteiro
    double n1 = 10, n2 = 8, media = (n1+n2)/2; // double = real com todas as casas, tendo maior precisão; float = real de forma simples. conhecido como ponto flutuante 
    Scanner ler = new Scanner (System.in); // é o leia do java. Aqui você define a variavel que você quer que  funcione como o leia
    System.out.println("Digite o nome: "); // Ele exibe tudo que esta dentro das aspas. funciona como um escreva/escreval
    nome = ler.nextLine(); // O next line é usado apenas para string
    System.out.println("Digite o número da Matrícula: "); // Ele exibe tudo que esta dentro das aspas. funciona como um escreva/escreval
    matricula = ler.nextInt(); // já o next Int funciona para apenas números inteiros.
    System.out.println("Digite a primeira nota: "); // Ele exibe tudo que esta dentro das aspas. funciona como um escreva/escreval
    n1 = ler.nextDouble(); // já o next double funciona para apenas números reais e exibe eles com maior precisão. / O float so simplifica o resultado. construção ->(variavel = ler.nextFloat(); )
     System.out.println("Digite a segunda nota: "); // Ele exibe tudo que esta dentro das aspas. funciona como um escreva/escreval
    n2 = ler.nextDouble(); // já o next double funciona para apenas números reais e exibe eles com maior precisão. / O float so simplifica o resultado. construção ->(variavel = ler.nextFloat(); )
    System.out.println("a media é igual a: " + media); // Ele exibe tudo que esta dentro das aspas. funciona como um escreva/escreval. o "+" é o complemento de exibição ou seja, ele exibe a variavel pois o texto
    }
    
}
