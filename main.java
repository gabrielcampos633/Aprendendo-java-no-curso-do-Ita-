public class main {

    public static void main(String[] args) {

        System.out.println("Quanto é 2 + 2? ");
        var resposta = System.console().readLine();
        var isRight = resposta.equals("4");
        if (isRight) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Resposta incorreta.");
        }

    }

}
