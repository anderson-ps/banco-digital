import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        List<Conta> contas = new ArrayList<>();
        Cliente anderson = new Cliente();
        Cliente marcos = new Cliente();
        marcos.setNome("Marcos Souza");
        anderson.setNome("Anderson Pires");

        Conta cc = new ContaCorrente(anderson);
        Conta poupanca = new ContaPoupanca(anderson);
        Conta poupanca2 = new ContaPoupanca(marcos);

        contas.add(cc);
        contas.add(poupanca);
        contas.add(poupanca2);

        cc.depositar(100);

        cc.transferir(15,poupanca);

        cc.imprimirExTrato();
        poupanca.imprimirExTrato();

        banco.setContas(contas);
        banco.listarClientes();
    }
}
