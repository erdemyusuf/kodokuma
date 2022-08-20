package kodokuma;

public class KodOkuma10 {
    int id;
    String name;
    KodOkuma10(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    KodOkuma10()
    {

    }
    void show()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String args[])
    {
        KodOkuma10 s1 = new KodOkuma10(100,"Ahmet");
        KodOkuma10 s2 = new KodOkuma10();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.show();
        s2.show();
    }
}
