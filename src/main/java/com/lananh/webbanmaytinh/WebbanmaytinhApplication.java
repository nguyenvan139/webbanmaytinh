package com.lananh.webbanmaytinh;

import com.lananh.webbanmaytinh.repository.SAN_PHAM_Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebbanmaytinhApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WebbanmaytinhApplication.class, args);
		SAN_PHAM_Repository sanphamRepository = context.getBean(SAN_PHAM_Repository.class);

		sanphamRepository.findAll().forEach(System.out::println);
	}
}
