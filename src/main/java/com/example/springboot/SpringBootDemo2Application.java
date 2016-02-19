package com.example.springboot;

import com.example.springboot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo2Application implements CommandLineRunner {

	// Simple example shows how a command line spring application can execute an
	// injected bean service. Also demonstrates how you can use @Value to inject
	// command line args ('--name=whatever') or application properties

	@Autowired
	private HelloWorldService helloWorldService;

	@Override
	public void run(String... args) {

		System.out.println(this.helloWorldService.getHelloMessage());

		if (args.length > 0 && args[0].equals("exitcode")) {
			throw new ExitException();
		}
	}


	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootDemo2Application.class, args);
	}
}
