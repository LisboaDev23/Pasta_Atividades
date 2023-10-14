public class JogoDescricao {

    private String nome;
    private String geracao;
    private int codigo;
    private double preco;


    JogoDescricao(String nome, String geracao) {
        this.nome=nome;
        this.geracao=geracao;
        this.codigo=codigo;
        this.preco=preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGeracao() {
        return geracao;
    }

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

