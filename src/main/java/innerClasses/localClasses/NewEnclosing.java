package innerClasses.localClasses;

public class NewEnclosing {

    void run() {
        //Local class is defined inside a method
        class Local {
            int x;
//            static int y;
            void run() {
                System.out.println("Local class run method working");
            }
        }
        Local local = new Local();
        local.run();
    }

    public static void main(String[] args) {
        NewEnclosing newEnclosing = new NewEnclosing();
        newEnclosing.run();
    }
}