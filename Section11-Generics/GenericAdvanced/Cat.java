public class Cat extends Animal{
    public Cat(String species, String familia, String name, int age){
        super(species, familia, name, age);
    }

    @Override
    public void voice(String sound) {
        super.voice(sound);

        System.out.println("Cat says: " + sound);
    }
}