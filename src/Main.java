import br.com.mb.screenmatch.modelo.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); //tipagem por referencia
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica(); // invocação de método
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(4);

        System.out.println(meuFilme.getSomaAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações %.2f ".formatted(meuFilme.retornaMedia()));
        //meuFilme.somaAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.retornaMedia());



    }
}
