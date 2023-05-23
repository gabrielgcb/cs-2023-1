public class Livro extends Produto {

    private String autor;

    public Livro(String descricao, String autor) {
        super.setDescricao(descricao);
        this.autor = autor;
    }

    public String getDescricao() {
        return "Descricao do produto: " + super.getDescricao()
                + " | Autor: " + this.getAutor();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
