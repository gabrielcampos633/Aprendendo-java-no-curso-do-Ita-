import java.util.Scanner;

public class main {

    public static void main(String[] args) {

      var scanner = new Scanner(System.in);
      System.out.println("Quantos anos você tem? ");
      var idade = scanner.nextInt();
      var canDrive = idade >=18; 
      System.out.println("Você pode dirigir? " + canDrive);

    }

}
