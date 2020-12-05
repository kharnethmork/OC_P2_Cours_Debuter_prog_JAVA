package S2C3_Condition_appropriee;

public class SwitchMe {
    private Color selectedColor;

    enum Color {
	    blue, green, red, yellow, purple;
	}

    /**
     * Constructeur de ma classe.
     */
	public SwitchMe() {
    }

    private void findColor(Color selectedColor) {

        //Remplacez les conditions if/else par un switch qui fonctionnera d'après la valeur de la variable selectedColor
        switch (selectedColor) {
            case blue:
                afficheMessage("Blue");
                break;
            case green:
                afficheMessage("Green");
                break;
            case red:
                afficheMessage("Red");
                break;
            case yellow:
                afficheMessage("Yellow");
                break;
            default:
                afficheMessageParDefaut("We don't know the color !");
        }
    }

    private void afficheMessage(String couleur) {
        System.out.println("The color is " + couleur);
    }

    private void afficheMessageParDefaut(String message) {
        System.out.println(message);
    }

    /**
     * Permet de démarre un programme.
     * @param args
     */
    public static void main(String[] args) {
        SwitchMe switchMe = new SwitchMe();
        switchMe.findColor(Color.purple);
    }
}