public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public Preguica() {
    }

    @Override
    public String toString() {
        return "Preguica{} " + super.toString();
    }

    public void subirEmArvores() {
        System.out.println("---------- @Subindo numa árvore...");
    }
}
