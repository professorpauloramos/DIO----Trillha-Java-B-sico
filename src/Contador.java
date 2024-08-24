
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int primeiroParametro = terminal.nextInt();
    
            System.out.println("Digite o segundo número: ");
            int segundoParametro = terminal.nextInt();
    
            try {
                contar(primeiroParametro, segundoParametro);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        } // O Scanner será fechado automaticamente aqui
    }
    
    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deverá ser maior que o primeiro");
        }

        int totalDeIteracoes = segundoParametro - primeiroParametro;
        
        for (int i = 1; i <= totalDeIteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Defina esta classe em um arquivo separado ou antes da classe Contador, se ela for usada no mesmo arquivo
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
