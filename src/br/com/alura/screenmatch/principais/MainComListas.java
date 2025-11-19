package br.com.alura.screenmatch.principais;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainComListas {
    public static void main(String[] args) {
        var meuFilme = new Filme("Invocação do Mal", 2025);
        meuFilme.avalia(7);
        var matrix = new Filme("The Matrix", 1999);
        matrix.avalia(6.5);
        var johnWick = new Filme("John Wick", 2014);
        johnWick.avalia(5);
        var laCasa = new Serie("La Casa de Papel", 2017);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(matrix);
        lista.add(johnWick);
        lista.add(meuFilme);
        lista.add(laCasa);

        // lista.forEach(item -> System.out.println(item));
        // lista.forEach(System.out::println);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação: "+ filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorAtor = new ArrayList<>();
        buscaPorAtor.add("Úrsula Corberó");
        buscaPorAtor.add("Miguel Herrán");
        buscaPorAtor.add("Jaime Lorente");
        buscaPorAtor.add("Patick Wilson");
        buscaPorAtor.add("Vera Farmiga");

        Collections.sort(buscaPorAtor);
        System.out.println(buscaPorAtor);

        Collections.sort(lista);
        System.out.println("Lista de Titulos Ordenada: ");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
    }
}
