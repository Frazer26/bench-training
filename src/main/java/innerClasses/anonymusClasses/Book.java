package innerClasses.anonymusClasses;

public class Book {

    final String title;

    public Book(String title) {
        this.title = title;
    }

    public String description() {
        return "Title: " + title;
    }
}

class Main {
    public static void main(String[] args) {
        //Extend a class
        Book book = new Book("Design Patterns") {
            // static int y = 0; // compilation error!
            @Override
            public String description() {
                return "Famous GoF book.";
            }
        };
        System.out.println(String.format("Title: %s, description: %s", book.title, book.description()));
    }

    //implement an Interface
    Runnable action = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello from runnable.");
        }
    };

    int count = 1;
    Runnable action2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable with captured variables: " + count);
        }
    };
}
