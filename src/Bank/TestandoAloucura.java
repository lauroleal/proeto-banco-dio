package Bank;

import java.net.StandardSocketOptions;
import java.text.DecimalFormat;

public class TestandoAloucura {
 public static  void main(String[] args){
     Banco banco;
     banco = new Banco();
     banco.numeroAgencia = 1234;

     Conta conta;
     conta = new Conta();
     conta.nomeCliente = "Lauro Leal";
     conta.CpfCliente = "18344556785";
     conta.RgCliente = "456788334e";
     conta.SaldoCliente = 10.000;

     DecimalFormat df = new DecimalFormat("#,###,##0.000");

     System.out.println("Hello " + conta.nomeCliente + " Seu saldo atual é: " +  df.format(conta.SaldoCliente) );

     System.out.println("Sacar");
     conta.sacar(2.000);
     System.out.println("Hello " + conta.nomeCliente + " Seu saldo atual é: " +  df.format(conta.SaldoCliente) );

     System.out.println("Depositar");
     conta.depositar(3.000);
     System.out.println("Hello " + conta.nomeCliente + " Seu saldo atual é: " +  df.format(conta.SaldoCliente) );

     System.out.println("Implementar transferencia na proxima..");
 }

}
