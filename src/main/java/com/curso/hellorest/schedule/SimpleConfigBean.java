package com.curso.hellorest.schedule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration()
@EnableScheduling
public class SimpleConfigBean {
	
	@Bean(name = "taskBean") 
	public TaskBean taskBean(){
		return new TaskBean();
	}

}
