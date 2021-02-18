package com.balazscholczer.udemy;

import java.util.Random;

public class App {
	
	public static void main(String[] args) {
		Random random = new Random();
		SequentialSum sequentialSum = new SequentialSum();
		
		int numberOfProcessors = Runtime.getRuntime().availableProcessors();
		
		int[] nums = new int[1000000000];
		
		for(int i=0; i<nums.length;++i)
			nums[i] = random.nextInt(100);
			
		long start = System.currentTimeMillis();
		
		System.out.println(sequentialSum.sum(nums));
		
		System.out.println("Sequential sum takes: " + (System.currentTimeMillis()-start) + "ms");
		
		start = System.currentTimeMillis();
		ParallelSum parallelSum = new ParallelSum(numberOfProcessors);
		System.out.println("Sum is " + parallelSum.sum(nums));
		System.out.println("Parallel sum takes: " + (System.currentTimeMillis()-start) + "ms");
		
	}

}
