import java.util.Arrays;

public class UppdatingArrays{
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Machiato" };
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5];

        for(int i = 0; i < menu.length; i++){
            // System.out.println(i + ". " + menu[i]);
            newMenu[i] = menu[i];
            newMenu[3] = "House Blend";
            newMenu[4] = "Dark Roast";
        }
        System.out.println(Arrays.toString(newMenu));

    }
}