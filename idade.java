import java.util.Scanner;

public class idade {

    public static void main(String[] args) { 
        var scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        var name = scanner.next();
        System.out.println("Quantos anos você tem? ");
        var idade = scanner.nextInt(); 
        System.out.printf("Olá, você se chama %s e tem %s anos", name, idade);
        


    } 
    
    }
