import com.domain.AirPlane;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Stepan
 */
@Configuration
@ComponentScan("com.domain")
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        AirPlane airPlane = context.getBean(AirPlane.class);
        System.out.println(airPlane.getPilot() == airPlane.getStewart());
    }
}
