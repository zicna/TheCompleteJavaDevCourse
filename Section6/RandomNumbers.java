public class RandomNumbers{
    public static void main(String[] args) {
        // System.out.println(randomNumber());
        int[][] randomNumTable = new int[100][10];

        for(int i =0; i < randomNumTable.length; i++){
            for(int j = 0; j < randomNumTable[i].length; j++){
                randomNumTable[i][j] = randomNumber();
            }
        }

        printTable(randomNumTable);
        
    }

    public static int randomNumber(){
        return (int)(Math.random() * 100 + 1);
    }

    public static void printTable(int[][] table){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}