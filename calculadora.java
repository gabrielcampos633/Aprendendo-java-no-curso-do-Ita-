import java.util.Scanner;
public class calculadora {

    public static void main(String[] args) {
    
var scanner = new Scanner(System.in);
System.out.println("Digite o primeiro número: ");
var num1 = scanner.nextInt();
System.out.println("Digite o segundo número: ");
var num2 = scanner.nextInt(); 
System.out.println("Escolha a operação: +, -, *, /");
var operacao = scanner.next();
System.out.println(("O resultado é: " + calcular(num1, num2, operacao)));

   
        


}  
    
    
} 