import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Variaves e Scanner.
        double lado;
        double area;
        Scanner teclado = new Scanner(System.in);

        // Ação
        System.out.println("quanto mede a lado do quadrado?");
        lado = teclado.nextDouble();
        teclado.close();
        area = lado * lado;
        System.out.println("A área do quadrado é " + area);
    }
}