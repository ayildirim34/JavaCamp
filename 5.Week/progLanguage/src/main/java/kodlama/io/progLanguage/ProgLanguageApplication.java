package kodlama.io.progLanguage;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProgLanguageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgLanguageApplication.class, args);}
	@Bean
	public ModelMapper getModelMapper() {
		return  new ModelMapper();
	}
}
