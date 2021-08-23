import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringContextConfiguration {
    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }


    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }
}
