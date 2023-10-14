import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        float area;
        float n = 3.14159f;
        Scanner scanner = new Scanner(System.in);
       float raio = scanner.nextFloat();
       float raio2 = raio*raio;
       area = n*raio2;
        System.out.printf(String.format("A=%.4f",area));
    }
}
