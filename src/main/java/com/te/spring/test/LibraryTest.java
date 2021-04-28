package com.te.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springannoation.AllConfig;
import com.te.springannoation.LibraryConfig;
import com.te.springbean.Library;

public class LibraryTest {

	public static void main(String[] args) {
			
	ApplicationContext context=new AnnotationConfigApplicationContext(AllConfig.class);
	 Library library=context.getBean(Library.class);
	 System.out.println(library.getLid());
	 System.out.println(library.getLname());
	 System.out.println(library.getBook());
	
	
	}

}
