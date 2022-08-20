package kodokuma;

public class KodOkuma08 {
    int id;
    String name;
    int age;
    //creating two arg constructor
    KodOkuma08(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    //creating three arg constructor
    KodOkuma08(int id,String name,int age)
    {
        this.id = id;
        this.name = name;
        this.age=age;
    }
    void show()
    {
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String args[])
    {
        KodOkuma08 s1 = new KodOkuma08(100,"Ahmet");
        KodOkuma08 s2 = new KodOkuma08(200,"Mehmet",18);
        s1.show();
        s2.show();
    }
}
