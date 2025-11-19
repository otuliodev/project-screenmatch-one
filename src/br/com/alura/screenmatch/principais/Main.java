package br.com.alura.screenmatch.principais;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Invocação do Mal", 2025);
        meuFilme.setDuracaoEmMinutos(150);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(3.5);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme matrix = new Filme("The Matrix", 1999);
        matrix.setDuracaoEmMinutos(135);
        matrix.setIncluidoNoPlano(true);

        Filme johnWick = new Filme("John Wick", 2014);
        johnWick.setDuracaoEmMinutos(101);
        johnWick.setIncluidoNoPlano(true);

        Serie laCasa = new Serie("La Casa de Papel", 2017);
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

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(matrix);
        listaDeFilmes.add(johnWick);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primerio filme: "+listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}
