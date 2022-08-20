package kodokuma;

public class KodOkuma07 {
    int id;
    String name;

    //creating a parameterized constructor
    KodOkuma07(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //method to display the values
    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        //creating objects and passing values
        KodOkuma07 s1 = new KodOkuma07(100, "Ahmet");
        KodOkuma07 s2 = new KodOkuma07(200, "Mehmet");
        //calling method to display the values of object
        s1.show();
        s2.show();
    }
}
