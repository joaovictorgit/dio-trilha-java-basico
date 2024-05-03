
import java.util.Scanner;

public class ContaTerminal {
    class Account {
        public int number;
        public String agency;
        public String clientName;
        public double value;

        public Account(int number, String agency, String clientName, double value) {
            this.number = number;
            this.agency = agency;
            this.clientName = clientName;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("\nConta: %d\nAgência: %s\nCliente: %s\nSaldo: %.2f", number, agency, clientName, value);
        }
    }

    Account createAccount(Scanner scan) {
        int number;
        String agency;
        String clientName;
        double value;
        
        System.out.println("Por favor, digite o numero da Agencia");
        number = scan.nextInt();

        System.out.println("Por favor, digite a Agencia");
        agency = scan.next();

        System.out.println("Por favor, digite o nome do cliente");
        clientName = scan.next();

        System.out.println("Por favor, digite o saldo");
        value = scan.nextDouble();

        return new Account(number, agency, clientName, value);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ContaTerminal terminal = new ContaTerminal();
        Account account = terminal.createAccount(scan);
        
        System.out.println(account.toString());
    }
}
