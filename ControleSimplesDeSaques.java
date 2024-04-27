import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        double saque = scanner.nextDouble();

        if (saque > limiteRestante) {
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        } else {
            limiteRestante -= saque;
            System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteRestante);
            System.out.println("Transacoes encerradas.");
        }

        scanner.close(); 
    }
}