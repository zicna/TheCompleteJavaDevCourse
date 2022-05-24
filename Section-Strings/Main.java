
class Main {
    public static void main(String[] args) {
  
      String name = "Milan";
      String name1 = name;
      String name2 = new String("Milan");
  
      System.out.println("name1: " + name1);
      System.out.println("name: " + name);
      System.out.println("name and name1 are storing same reference to the object: " + (name == name1));
      
      name1 = "Zile";
      System.out.println("name1: " + name1);
      System.out.println("name: " + name);
      System.out.println("name and name1 are storing same reference to the object: " + (name == name1));
      
      System.out.println(name == name2);
      
    }
  }