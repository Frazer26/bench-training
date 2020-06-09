package innerClasses.staticNestedClass;

public class Enclosing {

    private static int x = 1;
    private int y = 2;

    public static class StaticNested {
        private static String STATIC_MEMBER;
        private String nonStaticMember;

        //Only access to static member in the enclosing class
        private void run() {
            System.out.println("Static Nested class run." + x);
        }
    }

    public static void main(String[] args) {
        //belong to enclosing class and not to an instance of the class
        Enclosing.StaticNested nested = new Enclosing.StaticNested();
        nested.run();
    }
}
