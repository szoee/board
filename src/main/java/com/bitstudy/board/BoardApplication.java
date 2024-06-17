package com.bitstudy.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@SpringBootApplication
@ConfigurationPropertiesScan /* config > ThymeleafConfig 파일 만들면 해당 config 파일이 스캔될 수 있도록 이 어노테이션을 달아줘야 함 */
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
