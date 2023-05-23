public class AnimalTeste {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(1, new Cachorro());
        zoologico.adicionarAnimal(2, new Cavalo());
        zoologico.adicionarAnimal(3, new Preguica());
        zoologico.adicionarAnimal(4, new Leao());
        zoologico.adicionarAnimal(5, new Tigre());
        zoologico.adicionarAnimal(6, new Elefante());
        zoologico.adicionarAnimal(7, new Girafa());
        zoologico.adicionarAnimal(8, new Canguru());
        zoologico.adicionarAnimal(9, new Gorila());
        zoologico.adicionarAnimal(10, new Camelo());

        zoologico.percorrerJaulas();

    }
}
