package com.weslei.curso_dio_variaveis;

public class Operadores {
  public static void main(String[] args) {
    String concatenacao = "?";
    concatenacao = 1+1+1+1+"1";
    concatenacao =  "1"+(1+1+1);
    concatenacao = 1+"1"+1+"1";

    int numero = 5;
    System.out.println(numero);

    numero = - 5;
    System.out.println(numero);

    numero = + 5;
    System.out.println(numero);

    numero++;
    System.out.println(++numero);
    System.out.println(concatenacao);

    boolean variavel = true;
    System.out.println(!variavel);

    int num = 10;
    String resultado ="";
    resultado = num > 10? "verdadeiro": "falso";
    System.out.println(resultado);

    String nomeUm = "Weslei";
    String nomeDois = "Weslei";

    String nomeTres = "Peter";
    String nomeQuatro = new String("Peter");

    System.out.println(nomeDois == nomeUm);
    System.out.println(nomeTres.equals(nomeDois)); // Para objetos é bom usar equals

  }
}
