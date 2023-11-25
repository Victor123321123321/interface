public class Main {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void a1() {
                System.out.println();
            }
            public void a2() {
                System.out.println();
            }
        };

        B b = new B() {
            @Override
            public void b() {
                System.out.println();
            }
        };

    }
}
}