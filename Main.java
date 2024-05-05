import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro valor");
        int valorUm = sc.nextInt();

        System.out.println("Segundo valor");
        int valorDois = sc.nextInt();

        if (valorUm > valorDois){
            throw new ParametroInvalido("O segundo valor deve ser maior que o primeiro");
        }

        int diferença = valorDois - valorUm;

        for (int i = 1; i <= diferença; i++){
            System.out.println("Imprimindo o número "+ i);
        }
    }
}

    class ParametroInvalido extends RuntimeException{
    public ParametroInvalido(String message){
        super(message);
    }
    }
