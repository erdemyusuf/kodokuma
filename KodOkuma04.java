package kodokuma;

public class KodOkuma04 {
    String languages;

    // constructor accepting single value
    KodOkuma04(String lang) {
        languages = lang;
        System.out.println(languages + " Programming Language");
    }

    public static void main(String[] args) {

        // call constructor by passing a single value
        KodOkuma04 obj1 = new KodOkuma04("Java");
        KodOkuma04 obj2 = new KodOkuma04("Python");
        KodOkuma04 obj3 = new KodOkuma04("C");
    }
}
