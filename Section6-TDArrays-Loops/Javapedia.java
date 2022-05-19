import java.util.Scanner;

public class Javapedia{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("**********JavaPedia**********");
        System.out.println("How many historical figures will you register?");
        int number = scan.nextInt();
        String[][] database = new String[number][3];
        // String name;
        // String dob;
        // String occupation;

        scan.nextLine();
        for(int i = 0; i < number; i++){
            System.out.println("\tFigure " + (i +1));
            System.out.print("\t• Name: ");
            // name = scan.nextLine();
            // database[i][0] = name;
            database[i][0] = scan.nextLine();
            System.out.print("\t• Date of birth: ");
            // dob = scan.nextLine();
            // database[i][1] = dob;
            database[i][1] = scan.nextLine();
            System.out.print("\t• Occupation: ");
            // occupation = scan.nextLine();
            // database[i][2] = occupation;
            database[i][2] = scan.nextLine();
            System.out.println("\n");
        }

        System.out.println("These are the values you stored:");
        print2DArray(database);

        System.out.print("Who do you want information on? ");
        String request = scan.nextLine();

        searchByName(request, database);

        scan.close();
    }

    public static void print2DArray(String[][] db){
        for(int i = 0; i <db.length; i++){
            for(int j = 0; j < db[i].length; j++){
                System.out.print(db[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void searchByName(String name, String[][] db){   //name is always in column 0 in any row
        for(int i = 0; i <db.length; i++){
            if(db[i][0].equals(name)){
                for(int j = 0; j < db[i].length; j++){
                    System.out.print(db[i][j] + " ");
                }
                System.out.print("\n");
                System.exit(0);
            }
        }
        System.out.println("Nothing found");
    }
}