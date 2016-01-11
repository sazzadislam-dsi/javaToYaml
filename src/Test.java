/**
 * Created by sazzad on 1/11/16.
 */

public class Test {
    private int id;
    private String Name;
    private Another another;


    public Test() {
    }

    public Another getAnother() {
        return another;
    }

    public void setAnother(Another another) {
        this.another = another;
    }

    public Test(int id, String name, Another another) {
        this.id = id;
        Name = name;
        this.another = another;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
