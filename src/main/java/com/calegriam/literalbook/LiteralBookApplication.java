package com.calegriam.literalbook;

import com.calegriam.literalbook.ui.AppConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteralBookApplication implements CommandLineRunner {

	@Autowired
	private AppConsole app;

	public static void main(String[] args) {
		SpringApplication.run(LiteralBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		app.ejecutarOperaciones();
	}
}
