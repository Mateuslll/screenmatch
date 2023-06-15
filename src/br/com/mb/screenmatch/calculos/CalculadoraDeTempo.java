package br.com.mb.screenmatch.calculos;

import br.com.mb.screenmatch.modelo.Filme;
import br.com.mb.screenmatch.modelo.Serie;
import br.com.mb.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//       tempoTotal = tempoTotal + f.getDuracaoMinutos(); //tempo total vai receber duraçao de minutos atraves da variavel com tipo Filme chamada de f
//    }
//    public void inclui(Serie s){
//        tempoTotal = tempoTotal + s.getDuracaoMinutos(); //tempo total vai receber duraçao de minutos atraves da variavel com tipo Serie chamada de s
//    }
    public void inclui (Titulo t){
        System.out.println("Adicionando duração em minutos de " + t);
        this.tempoTotal += t.getDuracaoMinutos();
    }
}
