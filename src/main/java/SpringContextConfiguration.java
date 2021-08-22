import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContextConfiguration {
    @Bean
    public Core core(){return new Core();}

    @Bean
    public ProductRepository productRepository(){return new ProductRepository();}
}
