public class Veterinario {

    public void examinar(Animal animal) throws AnimalInvalidoException {
        animal.emitirSom();

        if (animal instanceof Cachorro) {
            ((Cachorro) animal).correr();
        } else if (animal instanceof Cavalo) {
            ((Cavalo) animal).correr();
        } else if (animal instanceof Preguica) {
            ((Preguica) animal).correr();
        } else {
            throw new AnimalInvalidoException();
        }
    }
}
