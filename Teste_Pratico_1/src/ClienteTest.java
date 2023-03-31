import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void testRecargaSaldo() {
        // Criação do objeto Cliente
        Telefone telefone = new Telefone("97979797", 0);
        Conta conta = new Conta(1000);
        Cliente cliente = new Cliente("Silvio Santos", telefone, conta);

        // Realização da recarga
        int valorRecarga = 50;
        cliente.getConta().setSaldo(cliente.getConta().getSaldo() - valorRecarga);
        cliente.getTelefone().setSaldo(cliente.getTelefone().getSaldo() + valorRecarga);

        // Verificação do saldo atual da linha
        int saldoAtual = cliente.getTelefone().getSaldo();
        assertEquals(50, saldoAtual);

        int saldoAtualConta = cliente.getConta().getSaldo();
        System.out.println("Saldo atual da conta do " + cliente.getNome() +" é = " + " R$ "+ saldoAtualConta);
    }

    @Test
    public void testSaldoAtualLinha() {
        // Criação do objeto Cliente
        Telefone telefone = new Telefone("89227988", 0);
        Conta conta = new Conta(0);
        Cliente cliente = new Cliente("Joao das Couves", telefone, conta);

        // Verificação do saldo atual da linha
        int saldoAtual = cliente.getTelefone().getSaldo();
        assertEquals(5, saldoAtual);


    }
}