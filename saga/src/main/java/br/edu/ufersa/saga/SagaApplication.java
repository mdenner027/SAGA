package br.edu.ufersa.saga;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class SagaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagaApplication.class, args);
	}
	
	@Bean
	public Filter getCharacterEncodingFilter() {

	    CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();

	    encodingFilter.setEncoding("ISO-8859-1");
	    encodingFilter.setForceEncoding(true);

	    return encodingFilter;

	}

}
