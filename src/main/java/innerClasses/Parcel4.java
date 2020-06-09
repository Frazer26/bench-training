package innerClasses;

interface Destination {
    String readLabel();
}


interface Contents {
    int value();
}

class Parcel4 {
    //Just Parcel4 can access it (normal classes cannot be made private/protected)
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

class InheritedParcel4 {

//    Parcel4 parcel4 = new Parcel4();
//    Parcel4.PDestination pDestination = parcel4.new PDestination();
}

class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        // Illegal -- can’t access private class:
        // ! Parcel4.PContents pc = p.new PContents();
    }
}
