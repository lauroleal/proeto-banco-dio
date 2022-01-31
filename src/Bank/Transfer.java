package Bank;
public class Transfer {

    private int numeroAgencia;
    private int numeroConta;
    //private double valorTransferencia;


    public Transfer(int numeroAgencia, int numeroConta, double valorTransferencia) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
       // this.valorTransferencia = valorTransferencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
/**
    public double getValorTransferencia() {
        return valorTransferencia;
    }

    public void setValorTransferencia(double valorTransferencia) {
        this.valorTransferencia = valorTransferencia;
    } */
}
