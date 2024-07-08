import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tabuadas tabuadas = new Tabuadas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha uma tabuada do 1 ao 10");
        int tabuadaEscolhida = scanner.nextInt();

        tabuadas.tabuadaDoUmAoDez(tabuadaEscolhida);

    }
}