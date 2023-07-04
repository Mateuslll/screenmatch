package br.com.mb.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
       if(classificavel.getClassificacao() >= 4){
           System.out.println("Preferidos da Galera!");
       }else if(classificavel.getClassificacao() >= 2){
           System.out.println("Muito bem avaliado");
       }else{
           System.out.println("Coloque na sua lista e assista depois!");
       }
    }
}
