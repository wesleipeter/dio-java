package com.weslei.ContaBanco;

public class ContaTerminal {
  private int numeroDaConta;
  private String agencia;
  private String nomeCliente;
  private double saldo;

  public void imprimirDados(){
    System.out.println("Olá, "+getNomeCliente(nomeCliente)+ "! obrigado por criar uma conta em nosso banco, sua agência"+
  " é: " +getAgencia(agencia)+ ", conta " +getNumeroDaConta(numeroDaConta)+  " e seu saldo é R$ "+ getSaldo(saldo)
        +" já está disponível para saque.");
  }

  public void setNomeCliente(String nomeCliente){
    this.nomeCliente = nomeCliente;
  }

  public void setAgencia(String agencia){
    this.agencia = agencia;
  }

  public void setNumeroDaConta(int numeroDaConta){
    this.numeroDaConta = numeroDaConta;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public String getNomeCliente(String nomeCliente){
    return this.nomeCliente;
  }

  public String getAgencia(String agencia){
    return this.agencia;
  }

  public int getNumeroDaConta(int numeroDaConta){
    return this.numeroDaConta;
  }

  public double getSaldo(double saldo){
    return this.saldo;
  }
}
