import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        this.parts.add(part);
    }

    public void show() {
        for (String part : this.parts) {
            System.out.println(part);
        }
    }
}
