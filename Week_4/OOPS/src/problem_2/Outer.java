package problem_2;

public class Outer {

    public void display() {
        System.out.println("Outer class display");
    }

    public class Inner {
        public void display() {
            System.out.println("Inner class display");
        }
    }
}