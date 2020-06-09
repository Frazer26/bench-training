package innerClasses;

public class Parcel1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
       Parcel1 parcel1 = new Parcel1();
       Parcel1.Contents contents = parcel1.new Contents();
       Parcel1.Destination destination = parcel1.new Destination("Tasmania");
       destination.readLabel();
    }
}
