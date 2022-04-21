public class Cat extends Animal{
    String meow;

    public Cat(String species, String familia, String name, int age, String meow){
        super(species, familia, name, age);
        this.meow = meow;
    }

    @Override
    public void voice() {
        super.voice();

        System.out.println("Cat says: ");
    }
}