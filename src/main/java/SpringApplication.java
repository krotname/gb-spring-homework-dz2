import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpringApplication {


    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        System.out.println(productRepository.getList());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Cart cart = context.getBean(Cart.class);

        while (true) {
            System.out.println("Введите 1 для создания новой корзины, 2 для добавления в текущую, 3 для удаления из текущей или exit для выхода из приложения");
            String s = br.readLine();
            if (s.equalsIgnoreCase("exit")) {
                break;
            }
            int R = 0;
            try {
                R = Integer.parseInt(s);
            } catch (NumberFormatException e) {

            }
            if (R == 1) {
                cart = context.getBean(Cart.class);
            }
            if (R == 2) {
                while (true) {
                    System.out.println("Введите номер товара (1-5) для добавления в карзину или exit для выхода из режима добавления товара");
                    String s2 = br.readLine();
                    if (s2.equalsIgnoreCase("exit")) {
                        break;
                    }
                    int i = 0;
                    try {
                        i = Integer.parseInt(s2);
                    } catch (NumberFormatException e) {

                    }
                    cart.add(productRepository.getId(i));
                }
            }
            if (R == 3) {
                while (true) {
                    System.out.println("Введите номер товара (1-5) для удаления из карзины или exit для выхода из режима удаления товара");
                    String s2 = br.readLine();
                    if (s2.equalsIgnoreCase("exit")) {
                        break;
                    }
                    int i = 0;
                    try {
                        i = Integer.parseInt(s2);
                    } catch (NumberFormatException e) {

                    }
                    cart.del(i);
                }
            }

            System.out.println("В корзине" + cart);
        }


    }
}
