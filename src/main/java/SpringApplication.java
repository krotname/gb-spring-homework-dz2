import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SpringApplication {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        System.out.println(productRepository.getList());

        //Core core = new Core();
        //List<Product> list = core.getProductRepository().getList();
        // List<Product> list = new ProductRepository().getList();
        ///System.out.println(list);


    }
}
