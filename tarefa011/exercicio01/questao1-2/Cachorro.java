public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public Cachorro() {
    }

    @Override
    public String toString() {
        return "Cachorro{} " + super.toString();
    }

}
