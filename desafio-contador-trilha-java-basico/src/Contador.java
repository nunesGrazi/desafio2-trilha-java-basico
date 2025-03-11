import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {       

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parametro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parametro:");
        int parametroDois = scanner.nextInt();

        try {
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}

        scanner.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
	}
}
