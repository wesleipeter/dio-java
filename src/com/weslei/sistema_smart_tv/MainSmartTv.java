package com.weslei.sistema_smart_tv;
// exemplo 01
public class MainSmartTv {
  public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();
    smartTv.tvLigada = true;
    smartTv.canal = smartTv.trocarCanal(34);
    smartTv.volume += smartTv.alterarVolume(10);

    smartTv.imprime();
    smartTv.ligar();

  }
}

