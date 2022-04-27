public class Cat implements Printable{
    public String name;
    public int age;

    public Cat(){

    }

    @Override
    public void print() {
        System.out.println("meaow");
    }

    @Override
    public void printWithArg(String suffix) {
        // TODO Auto-generated method stub
        
    }
}