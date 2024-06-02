package com.weslei.curso_dio;
import java.util.ArrayList;
import java.util.List;

public class Teste {
  public static void modifyList(List<Integer> list) {
  }

  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>(List.of(5, 6, 7,9));
    modifyList(myList);
    System.out.println(myList);
  }
}