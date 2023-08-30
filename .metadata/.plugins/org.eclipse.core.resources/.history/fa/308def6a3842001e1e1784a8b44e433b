package com.example.demo;

class Series<T,U>//Generic Class
{
	
	T obj;
	U obj2;
	Series(T obj,U obj2)
	{
		this.obj=obj;
		this.obj2=obj2;
	}
	public T getObj()
	{
		return obj;
	}
	public U getObj2()
	{
		return obj2;
	}
}
public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series<Integer,String> s=new Series<Integer,String>(10,"Ten");
		Series<Float,Double> s1=new Series<Float,Double>(198.45f,154.98);
		System.out.println("First Obj Value: "+s.getObj());
		System.out.println("Second Obj value: "+s1.getObj2());
	}

}
