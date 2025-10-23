import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Invocação do Mal 5");
        meuFilme.setAnoDeLancamento(2025);
        meuFilme.setDuracaoEmMinutos(150);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(3.5);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme matrix = new Filme();
        matrix.setNome("The Matrix");
        matrix.setAnoDeLancamento(1999);
        matrix.setDuracaoEmMinutos(135);
        matrix.setIncluidoNoPlano(true);

        Filme johnWick = new Filme();
        johnWick.setNome("John Wick");
        johnWick.setAnoDeLancamento(2014);
        johnWick.setDuracaoEmMinutos(101);
        johnWick.setIncluidoNoPlano(true);

        Serie laCasa = new Serie();
        laCasa.setNome("La Casa de Papel");
        laCasa.setAnoDeLancamento(2017);
        laCasa.setIncluidoNoPlano(true);
        laCasa.setAtiva(true);
        laCasa.setTemporadas(5);
        laCasa.setEpisodiosPorTemporada(10);
        laCasa.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(matrix);
        calculadora.inclui(johnWick);
        calculadora.inclui(laCasa);
        calculadora.inclui(meuFilme);
        System.out.println("Tempo Total: "+calculadora.getTempoTotal());

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(laCasa);
        primeiro.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(primeiro);
    }
}
