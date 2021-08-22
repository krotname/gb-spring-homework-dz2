import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@ToString
public class Cart {
    private List list = new ArrayList<Product>();

    public void add(Product p) {
        list.add(p);
    }

    public void del(int id) {
        list.remove(id);
    }

}
