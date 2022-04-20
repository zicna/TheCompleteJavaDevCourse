public class Berries{
    String berry = "blue";

    public static void main(String[] args) {
        new Berries().juicy("straw");
    }

    void juicy(String berry){
        this.berry = "rasp";
        System.out.println(berry + "berry");
    }
}