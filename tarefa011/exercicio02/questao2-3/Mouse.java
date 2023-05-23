public class Mouse extends Produto {

    private String tipo;

    public Mouse(String descricao, String tipo) {
        super.setDescricao(descricao);
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return "Descricao do produto: " + super.getDescricao()
                + " | Tipo: " + this.getTipo();
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
