package com.te.springannoation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springbean.Book;

@Configuration
public class BookConfig {
	@Bean
	public Book getbook()
	{
		Book book=new Book();
		book.setBid(2);
		book.setBname("unix");
		return book;
		
		
	}

}
