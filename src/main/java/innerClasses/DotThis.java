package innerClasses;

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        //producing the reference to the outer-class object (checked at compile time)
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        dotThis.f();

        DotThis.Inner inner = dotThis.inner();
        inner.outer().f();
    }
}
