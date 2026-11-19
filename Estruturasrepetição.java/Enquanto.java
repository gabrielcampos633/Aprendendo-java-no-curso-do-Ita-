import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";

        while (!name.equals("exit")) {
            name = scanner.next();
            System.out.println(name);
        }

        
    }
}
    