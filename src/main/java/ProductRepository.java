import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    @Getter
    private List<Product> list = new ArrayList<>();

    public ProductRepository() {
        list.add(new Product(1, 2.0, "Name #1"));
        list.add(new Product(2, 1.5, "Name #2"));
        list.add(new Product(3, 2.5, "Name #3"));
        list.add(new Product(4, 2.2, "Name #4"));
        list.add(new Product(5, 2.9, "Name #5"));
    }
    public Product getId(int id){
        return  list.get(id);
    }
}
