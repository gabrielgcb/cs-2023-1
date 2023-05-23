public class AnimalTeste {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro("Bob", 6);
        Cavalo cavalo1 = new Cavalo("Spirit", 20);
        Preguica preguica1 = new Preguica("Sid", 30);

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro1);
        veterinario.examinar(cavalo1);
        veterinario.examinar(preguica1);

    }
}
