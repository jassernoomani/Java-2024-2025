import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom du zoo :");
        String zooName = scanner.nextLine();

        System.out.println("Entrez la ville du zoo :");
        String zooCity = scanner.nextLine();

        System.out.println("Entrez le nombre maximum de cages :");
        int nbrCages = scanner.nextInt();

        Zoo myZoo = new Zoo(zooName, zooCity, nbrCages);

        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Shera", 4, true);

        System.out.println("Ajout  " + lion.getName()+ " : " + myZoo.addAnimal(lion));
        System.out.println("Ajout  " +tiger.getName()+ " : " + myZoo.addAnimal(tiger));

        myZoo.displayZoo();
        myZoo.displayAnimals();

        System.out.println("Recherche de Simba : " + myZoo.searchAnimal(lion));

        System.out.println("Suppression de Simba : " + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();

        Zoo anotherZoo = new Zoo("City Zoo", "Sfax", 3);
        anotherZoo.addAnimal(new Animal("Birds", "Parrot", 3, false));
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println(biggerZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.getName());
    }
}
