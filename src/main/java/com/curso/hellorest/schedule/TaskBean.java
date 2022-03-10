package com.curso.hellorest.schedule;

import org.springframework.stereotype.Component;

@Component
public class TaskBean {
    public void t1(){
        System.out.println("Started fixed delay t1");
    }

    public void t2(){
        System.out.println("Started t2");
    }

    public void t3(){
        System.out.println("Started t3");
    }

	public void t4(){
		System.out.println("Started cron job");
	}	 
}
