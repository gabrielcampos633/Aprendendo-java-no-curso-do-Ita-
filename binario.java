public class binario { 

    public static void main(String[] args) { 

        var value1 = 6; 
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número %s, em binário %s%n\n", value1, binary1);
        var value2 = 5; 
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número %s, em binário %s%n \n", value2, binary2);

    } 
    
    }

    // So pra deixar claro, que isso nao vai ser algo que vou utilizar, mas é bom saber que pode existir isso em um código java, 
    // que é a possibilidade de declarar uma variável com var, e o compilador vai inferir o tipo da variável.