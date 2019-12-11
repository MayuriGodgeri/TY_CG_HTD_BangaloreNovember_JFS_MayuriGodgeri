package com.capgemini.ds.algoanalysis;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
public static void main(String[] args) {
	long num=9999999999l;
	System.out.println(addUpto(num));
	System.out.println(addUptoQuick(num));
	System.out.println("--------------------");
	//algo on the basis of time
	countingDuration1();          // time complexity & space utilization
	countingDuration2();          
}
public static long addUpto(long num) {
	long total=0l;
	for(long i=0;i<=num;i++) {
		total=total+i;
	}
	return total;
}

public static long addUptoQuick(long num) {
	return num * (num+1)/2;
}
public static void countingDuration1() {
	long num=999999999l;
	Instant start= Instant.now();  //Instant is a class...Instant.now will record the time as soon as this line executes
	System.out.println("addupto: "+addUpto(num));
	Instant end= Instant.now();  //it record the termination time of addupto()
	long duration = Duration.between(start,end).toMillis();  // duration between this 2 records
	double seconds = duration/1000.0;
	System.out.println("addUpto time: "+seconds +"");
	System.out.println("---------adduptoquick--------------");
}
public static void countingDuration2() {
	long num=999999999l;
	Instant start= Instant.now();  //Instant is a class...Instant.now will record the time as soon as this line executes
	System.out.println("adduptoQuick: "+addUptoQuick(num));
	Instant end= Instant.now();  //it record the termination time of addupto()
	long duration = Duration.between(start,end).toMillis();  // duration between this 2 records
	double seconds = duration/1000.0;
	System.out.println("addUptoQuick time: "+seconds +"");
	
}
}
