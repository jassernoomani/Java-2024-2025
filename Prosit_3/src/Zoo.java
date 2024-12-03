public class Zoo {
    private Animal[] animals;
    private int animalCount = 0; // Compteur d'animaux
    private final int nbrCages; // Nombre maximum de cages
    private String name;
    private String city;

    // Constructeur
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    public String getName() {
        return name;
    }



    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return false; // Animal déjà présent
            }
        }
        if (animalCount < nbrCages) {
            animals[animalCount++] = animal;
            return true;
        }
        return false; // Zoo plein
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[--animalCount] = null; // Réduire le compteur
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}');
    }

    public void displayAnimals() {
        System.out.println("Animaux du zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("- " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount >= z2.animalCount ? z1 : z2;
    }
}
