public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);

        Zoo myZoo = new Zoo("Zoo Mania", "Paris", 20, 25);

        myZoo.addAnimal(lion, 0);
        myZoo.addAnimal(elephant, 1);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
    }
}
