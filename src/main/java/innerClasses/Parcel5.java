package innerClasses;

//creation of an entire class within the method scope
    public class Parcel5 {

        private Destination destination(String s) {
            class PDestination implements Destination {
                private String label;

                private PDestination(String whereTo) {
                    label = whereTo;
                }

                public String readLabel() {
                    return label;
                }
            }
            return new PDestination(s);
        }

        public static void main(String[] args) {
            Parcel5 p = new Parcel5();
            Destination d = p.destination("Tasmania");;
        }
    }
