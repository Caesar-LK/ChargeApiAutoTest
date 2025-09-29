import hello.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :Caesar
 * @date 2025/09/18 14:30
 **/
@SpringBootApplication
@ComponentScan("com.course")//作用是告诉系统这个是被扫描的类
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
