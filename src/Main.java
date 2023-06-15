import br.com.mb.screenmatch.calculos.CalculadoraDeTempo;
import br.com.mb.screenmatch.modelo.Filme;
import br.com.mb.screenmatch.modelo.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); //tipagem por referencia
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme(); //tipagem por referencia
        outroFilme.setNome("O poderoso Chefão 2");
        outroFilme.setAnoDeLancamento(1970);
        outroFilme.setDuracaoMinutos(200);
        outroFilme.setIncluidoNoPlano(true);

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
    }
}
