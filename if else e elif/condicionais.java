import java.util.Scanner;
public class condicionais {

    public static void main(String[] args) { 
    var scanner = new Scanner(System.in); 
    System.out.println("Digite sua idade: ");
    var idade = scanner.nextInt();
    System.out.println("Digite seu nome: ");
    var nome = scanner.next();

    if (idade >= 18) {
        System.out.printf("Olá %s, você é maior de idade %s\n", nome, idade);
    } else if (idade < 18 && idade >= 0) {
        System.out.printf("Olá %s, você é menor de idade %s\n", nome, idade);
    }
        System.out.println("Fim da execução do programa");
  
    }

    } 
    