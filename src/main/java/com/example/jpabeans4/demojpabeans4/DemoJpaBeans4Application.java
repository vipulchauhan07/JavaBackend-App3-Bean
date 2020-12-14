package com.example.jpabeans4.demojpabeans4;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoJpaBeans4Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaBeans4Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.register(MyConfig.class);

		ctx.refresh();

		HelloWorld obj = ctx.getBean(HelloWorld.class);

		obj.setData("Bean");

		obj.setMsg("Test Bean!");

		System.out.println(obj);
	}

}
