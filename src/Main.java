import com.esotericsoftware.yamlbeans.YamlWriter;

import java.io.FileWriter;

/**
 * Created by sazzad on 1/11/16.
 */
public class Main {
    public static void main(String[] args) {
        Another another = new Another(1,"test");
        Test test = new Test(1, "sazzad",another);

        try {
            YamlWriter writer = new YamlWriter(new FileWriter("output.yml"));
            writer.write(test);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
