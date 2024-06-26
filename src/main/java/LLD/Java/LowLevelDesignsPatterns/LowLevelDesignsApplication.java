package LLD.Java.LowLevelDesignsPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class LowLevelDesignsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LowLevelDesignsApplication.class, args);
	}

}
