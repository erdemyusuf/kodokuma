package kodokuma;

public class KodOkuma09 {
    int id;
    String name;
    //constructor to initialize integer and string
    KodOkuma09(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    //constructor to initialize another object
    KodOkuma09(KodOkuma09 s)
    {
        this.id = s.id;
        this.name = s.name;
    }
    void show()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String args[])
    {
        KodOkuma09 s1 = new KodOkuma09(100,"Ahmet");
        KodOkuma09 s2 = new KodOkuma09(s1);
        s1.show();
        s2.show();
    }
}
