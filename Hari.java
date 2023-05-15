
public class Hari implements java.io.Serializable
{
    private int id;
    private String name;
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
class Test {
    public static void main(String args[])
    {
        Hari obj = new Hari();
        obj.setName("Hello");
        obj.setId(190164);
        System.out.println(obj.getName()+" "+obj.getId());
    }
}

