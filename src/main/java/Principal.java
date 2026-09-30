import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leitor = new
            Scanner(System.in);
        
        int anoNascimento, anoAtual, idade;
        
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = leitor.nextInt();
        
        System.out.println("Digite o ano atual: ");
        anoAtual = leitor.nextInt();
        
        if (anoNascimento < anoAtual) {
            idade = anoAtual - anoNascimento;
            
            System.out.printf("A idade da pessoa e: %d anos", idade);
        } else {
            System.out.printf("Ano de nascimento invalido");
            
        }
        leitor.close();
    }
}
