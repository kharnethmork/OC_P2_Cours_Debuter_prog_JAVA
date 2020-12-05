package S2C3_Condition_appropriee;

public enum Color {

    BLUE("blue", "bleu"),
    GREEN("green", "vert"),
    RED("red","rouge)"),
    YELLOW("yellow", "jaune");

    private String color;
    private String couleur;

    Color(String color, String couleur) {
        this.color = color;
        this.couleur = couleur;
    }

    public String getColor() {
        return color;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
