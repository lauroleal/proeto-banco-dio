package Bank;
import java.util.ArrayList;

public class Conta{



    protected String nomeCliente;
    protected String CpfCliente;
    protected String RgCliente;
    protected double SaldoCliente;

    public Conta(String nomeCliente, String cpfCliente, String rgCliente) {
        this.nomeCliente = nomeCliente;
        CpfCliente = cpfCliente;
        RgCliente = rgCliente;
        SaldoCliente = SaldoCliente;}

    public Conta() {

    }

    public String getNomeCliente() { return nomeCliente;}
    public String getCpfCliente() { return CpfCliente; }
    public String getRgCliente() {return RgCliente;}
    public double getSaldoCliente() {return SaldoCliente;}

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente; }

    public void setCpfCliente(String cpfCliente) {
        this.CpfCliente = cpfCliente;}

    public void setRgCliente(String rgCliente) {
        this.RgCliente = rgCliente;}

    public void setSaldoCliente(double SaldoCliente) {
        this.SaldoCliente = SaldoCliente;}

    ArrayList dadosTransf = new ArrayList();

    public void sacar(double valor) {
        this.SaldoCliente -= valor;
    }

    public void depositar(double valor) {
        this.SaldoCliente += valor;
    }

    public void transferir(double valor, Transfer contaDestino) {
        this.sacar(valor);
        dadosTransf.add(valor);
        dadosTransf.add(contaDestino.getNumeroAgencia());
        dadosTransf.add(contaDestino.getNumeroConta());
    }
}



