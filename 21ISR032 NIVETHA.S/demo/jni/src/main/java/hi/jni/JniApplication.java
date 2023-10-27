package hi.jni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JniApplication {

	public static void main(String[] args) {
		SpringApplication.run(JniApplication.class, args);
		System.out.println("hello world");
	}

}
