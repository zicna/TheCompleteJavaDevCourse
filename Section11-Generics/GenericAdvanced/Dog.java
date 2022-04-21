public class Dog extends Animal{
    String bark;

    public Dog(String species, String familia, String name, int age, String bark){
        super(species, familia, name, age);
        this.bark = bark;
    }

    @Override
    public void voice() {
        super.voice();

        System.out.println("Dog says: " + this.bark);
    }
}