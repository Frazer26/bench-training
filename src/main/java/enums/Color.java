package enums;

public enum Color {
    GREEN("green"),
    RED("red"),
    YELLOW("yellow"),
    WHITE("white");

    public final String label;

    private Color(String label) {
        this.label = label;
    }

    public static Color valueOfLabel(String label) {
        for (Color e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
