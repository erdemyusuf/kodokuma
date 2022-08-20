package kodokuma;

public class KodOkuma02 {
    int i;

    // constructor with no parameter
    private KodOkuma02() {
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {

        // calling the constructor without any parameter
        KodOkuma02 obj = new KodOkuma02();
        System.out.println("Value of i: " + obj.i);
    }
}
