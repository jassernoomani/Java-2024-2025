public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void displayAnimalInfo() {
        System.out.println("Animal: " + name);
        System.out.println("Famille: " + family);
        System.out.println("Âge: " + age + " ans");
        System.out.println("Est un mammifère: " + (isMammal ? "Oui" : "Non"));
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
