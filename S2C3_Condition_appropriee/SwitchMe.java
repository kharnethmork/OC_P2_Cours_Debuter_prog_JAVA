public class SwitchMe {
	enum Color {
	    blue, green, red, yellow;
	}
	public static void main(String[] args) {

    	Color selectedColor = Color.green;
    
        //Remplacez les conditions if/else par un switch qui fonctionnera d'après la valeur de la variable selectedColor
        switch (selectedColor) {
            case blue:
                System.out.println("The color is Blue");
                break;
            case green:
                System.out.println("The color is Green");
                break;
            case red:
                System.out.println("The color is Red");
                break;
            case yellow:
                System.out.println("The color is Yellow");
                break;
            default:
            System.out.println("We do not know the color!");
        }
    }
}