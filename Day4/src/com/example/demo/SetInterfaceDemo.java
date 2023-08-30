package com.example.demo;

import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1=new TreeSet<Integer>();
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(500);
		System.out.println("SET 1 values: "+set1);
		Set<Integer> set2=new TreeSet<Integer>();
		set2.add(100);
		set2.add(200);
		set2.add(600);
		set2.add(700);
		set2.add(800);
		System.out.println("SET 2 values: "+set2);
		Set<Integer> union=new TreeSet<Integer>(set1);
		union.addAll(set2);
		Set<Integer> intersect=new TreeSet<Integer>(set1);
		intersect.retainAll(set2);
		Set<Integer> difference=new TreeSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("UNION : "+union);
		System.out.println("Intersection: "+intersect);
		System.out.println("Difference: "+difference);
	}

}
