public class EvenOrOdd{
    public static void main(String[] args) {
        for(int i = 0; i <= 19; i++){
            System.out.print(i+ " - ");
            if(i % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}