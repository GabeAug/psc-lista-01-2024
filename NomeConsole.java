import java.text.DecimalFormat;
import java.util.Scanner;

public class NomeConsole {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String nome;

        System.out.println("Esreva seu nome: ");
        nome = ler.nextLine();
        System.out.println("Nome: " + nome);
    }

    
}
