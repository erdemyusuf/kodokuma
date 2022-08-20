package kodokuma;

public class KodOkuma01 {
    private String name;

    // constructor
    KodOkuma01() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main class
        KodOkuma01 obj = new KodOkuma01();
        System.out.println("The name is " + obj.name);
    }
}


// bu not github da eklendi
