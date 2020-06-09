package innerClasses.inheritingFromInnerClass;

class WithInner {
    WithInner(String a) {
        System.out.println("Outer constructor: "+ a);
    }
    class Inner {
        Inner(String b) {
            System.out.println("Inner constructor: "+ b);
        }
        void exampleMethod() {
            System.out.println("Inner class method.");
        }
    }
}

class InheritInner extends WithInner.Inner {
    //! InheritInner() {} // Won’t compile
    InheritInner(WithInner wi) {
        wi.super("b");
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner("a");
        InheritInner ii = new InheritInner(wi);
        ii.exampleMethod();
    }
}
