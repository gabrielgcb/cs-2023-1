public class Zoologico {

    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(int jaula, Animal animal) {
        if(jaula-1 >= 0 && jaula-1 <= jaulas.length) {
            jaulas[jaula-1] = animal;
        }
    }

    public void percorrerJaulas() {
        for(Animal animal: jaulas) {
            if(animal != null) {
                animal.emitirSom();
                animal.correr();
            }
        }
    }
}
