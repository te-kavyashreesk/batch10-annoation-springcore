package com.te.springannoation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springbean.Library;
@Configuration
public class LibraryConfig {
@Bean
	public Library getObject()
	{
		Library Library=new Library();
		Library.setLid(10);
		Library.setLname("sree");
		return Library;
		
	}
}
