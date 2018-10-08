package com.ericsson.devops;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LamdaEx {
	public static void main(String[] args) {
			
			
			Runnable r = () -> System.out.println("Thread Name is :- "+Thread.currentThread().getName());
				ExecutorService executors = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()-1);
					
					for (int i = 0 ;i< 8 ; i++) {
								executors.submit(r);
									}
						System.out.println("Thread Name is "+Thread.currentThread().getName());
							System.out.println("End Main ");
	}
}

