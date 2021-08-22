import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Core {
    @Getter
    private ProductRepository productRepository;

    @Getter
    private Cart cart;
}
