package ScrapWala.ScrapWala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EntityScan(basePackages = {"ScrapWala.ScrapWala.entities"})
public class ScrapWalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrapWalaApplication.class, args);
		System.out.println("hii ...................");
	}

}
