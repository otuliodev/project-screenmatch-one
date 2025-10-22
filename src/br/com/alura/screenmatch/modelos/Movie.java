public class Movie {
    String movieName;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: "+movieName);
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
        System.out.println("Incluido no Plano: "+incluidoNoPlano);
        System.out.println("Duração: "+duracaoEmMinutos);

    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
