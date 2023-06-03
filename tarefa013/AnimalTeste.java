public class AnimalTeste {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Bob", 6);
        Cavalo cavalo1 = new Cavalo("Spirit", 20);
        Preguica preguica1 = new Preguica("Sid", 30);

        Veterinario veterinario = new Veterinario();

        for (Animal animal : animais) {
            try {
                veterinario.examinar(animal);
            } catch (AnimalInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
