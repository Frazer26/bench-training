package enums;

import java.util.HashMap;
import java.util.Map;

public enum Element {

    H("Hydrogen"),
    HE("Helium"),
    NE("Neon");

    public final String label;

    private Element(String label) {
        this.label = label;
    }

    private static final Map<String, Element> BY_LABEL = new HashMap<>();

    static {
        for (Element e: values()) {
            BY_LABEL.put(e.label, e);
        }
    }

    public static Element valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
}