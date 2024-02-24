package co.zhora.sbcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SbcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcrudApplication.class, args);
	}

}
