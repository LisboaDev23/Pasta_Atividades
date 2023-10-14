import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//List - INTERFACE->tipo da interface->nome da váriavel-> new ArrayList<tipo de variável da implementação>(); - IMPLEMENTAÇÃO
//Coleção do tipo List pode crescer bastante, e a busca de seus elementos é mais rápida, mas inserções e exclusões não são rápidas
        /*List <-[declarar uma coleção, nesse caso é a Lista] <String> <-[tipo de váriavel na lista ou uma própria classe,
        se for variável deve sempre ser tipo Wrapper] jogos <- [nome da váriavel] = new ArrayList<String>(); ["Instanciando a lista que sera o meu Array para adicionar itens]*/

public class Main {
    public static void main(String[] args) {

    }

    private static void consultorGame() {
        List<JogoDescricao> games = new ArrayList<JogoDescricao>();
        JogoDescricao fifa = new JogoDescricao("Fotball");
        games.add(fifa);

    }

}