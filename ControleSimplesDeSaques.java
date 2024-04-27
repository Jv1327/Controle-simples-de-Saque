import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        while (true) {
            double saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            if (saque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            limiteRestante -= saque;
            System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteRestante);
        }

        scanner.close(); 
    }
}
