public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages, int maxAnimals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[maxAnimals];
    }

    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        } else {
            System.out.println("Indice invalide, impossible d'ajouter l'animal.");
        }
    }

    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
