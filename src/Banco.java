import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarClientes(){
        System.out.println("Lista de clientes: ");
        for (Conta c: this.contas) {
            System.out.println("Cliente: " + c.cliente.getNome());
            System.out.println("Numero da conta: " + c.numero);

        }
    }
}
