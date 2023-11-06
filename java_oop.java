class SupperClass {

    public interface a {

    }

    public String total() {
        return "A";
    }
}

class Subclass extends SupperClass {

    @Override
    public String total() {
        return "2.0subclass";
    }

    public String total(double c, int a) {
        return "2.0";
    }
}

public class java_oop {

    public static void main(String[] args) {
        SupperClass a1 = new Subclass(); // up casting
        System.out.println(a1.total());

        // SupperClass a = new SupperClass(); // up casting
        if (a1 instanceof Subclass) {
            Subclass subclass = (Subclass) a1;
            System.out.println(subclass.total(0, 0));
        }
    }

}
