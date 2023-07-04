package br.com.mb.screenmatch.modelo;

import br.com.mb.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome) { // constructor Filme
        this.setNome(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (retornaMedia()/2); // casting
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + (this.getAnoDeLancamento()) + ")";
    }
}
