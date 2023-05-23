public class AnimalTeste {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro("Bob", 6);
        Cavalo cavalo1 = new Cavalo("Spirit", 20);
        Preguica preguica1 = new Preguica("Sid", 30);

        cachorro1.emitirSom();
        cavalo1.emitirSom();
        preguica1.emitirSom();

    }
}
