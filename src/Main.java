import br.com.mb.screenmatch.calculos.CalculadoraDeTempo;
import br.com.mb.screenmatch.calculos.FiltroRecomendacao;
import br.com.mb.screenmatch.modelo.Episodio;
import br.com.mb.screenmatch.modelo.Filme;
import br.com.mb.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão"); //tipagem por referencia
     //   meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme("O poderoso Chefão 2: "); //tipagem por referencia
    //    outroFilme.setNome("O poderoso Chefão 2: ");
        outroFilme.setAnoDeLancamento(1970);
        outroFilme.setDuracaoMinutos(200);
        outroFilme.setIncluidoNoPlano(true);

        var outroFilmeSegundo = new Filme("Dog view"); //tipagem por referencia
        //outroFilmeSegundo.setNome("Dog view");
        outroFilmeSegundo.setAnoDeLancamento(1970);
        outroFilmeSegundo.setDuracaoMinutos(200);
        outroFilmeSegundo.avaliaFilme(10);
        outroFilmeSegundo.setIncluidoNoPlano(true);

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
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpsodio(50);

        System.out.println("Duração do para maratonar Lost  : " + lost.getDuracaoMinutos());
        CalculadoraDeTempo calcula = new CalculadoraDeTempo();

        calcula.inclui(meuFilme);
        calcula.inclui(outroFilme);
        calcula.inclui(lost);
        System.out.println(calcula.getTempoTotal());
        //System.out.println(lost.getEpsodiosPorTemporada());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(outroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(3000);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
        // var listaDeFilmes = new ArrayList<Filme>(); e a mesma coisa
        listaDeFilmes.add(outroFilmeSegundo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme posição da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString Primeiro filme posição da lista: " + listaDeFilmes.get(0).toString());


    }
}
