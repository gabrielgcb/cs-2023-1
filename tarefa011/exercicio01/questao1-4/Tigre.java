public class Tigre extends Animal {

    public Tigre(String nome, int idade) {
        super(nome, idade);
    }

    public Tigre() {
    }

    @Override
    public String toString() {
        return "Tigre{} " + super.toString();
    }
}
