package kodokuma;

public class KodOkuma005 {
    //kodokuma 05 clasında default constructor vardı burada aynısını
    //biz oluşturduk defaultun yerine gecti
    //yine aynı sonucu yazdırıyoruz
    int a;
    boolean b;

    KodOkuma005() {
        a = 0;
        b = false;
    }

    public static void main(String[] args) {
        // call the constructor
        KodOkuma005 obj = new KodOkuma005();

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}
