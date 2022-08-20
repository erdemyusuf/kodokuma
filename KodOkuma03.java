package kodokuma;

public class KodOkuma03 {
    String name;

    // public constructor
    public KodOkuma03() {
        name = "Programiz";
    }
}

class Class_01 {
    public static void main(String[] args) {

        // object is created in another class
        KodOkuma03 obj = new KodOkuma03();
        System.out.println("Company name = " + obj.name);
    }
}
