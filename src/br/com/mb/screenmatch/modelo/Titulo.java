package br.com.mb.screenmatch.modelo;

public class Titulo {

        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaAvaliacoes;
        private int totalDeAvaliacoes;
        private int duracaoMinutos;


        public int getTotalDeAvaliacoes(){
            return totalDeAvaliacoes;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setDuracaoMinutos(int duracaoMinutos) {
            this.duracaoMinutos = duracaoMinutos;
        }

        public String getNome() {
            return nome;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public int getDuracaoMinutos() {
            return duracaoMinutos;
        }

        public double getSomaAvaliacoes() {
            return somaAvaliacoes;
        }   //Getters e setters sem Lombok

        public void exibeFichaTecnica(){
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
        }
        public void avaliaFilme(double nota){
            somaAvaliacoes += nota;
            totalDeAvaliacoes++;
        }
        public double retornaMedia(){
            return somaAvaliacoes / totalDeAvaliacoes;
        }
}

