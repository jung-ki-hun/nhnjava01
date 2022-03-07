package nhn01;

import java.io.*;

class HelloWorld{
	public HelloWorld(String[] args) {
		System.out.println("helloworld");
		int size = args.length;
		for(int i =0;i<size;i++) {
			System.out.println(args[i]);
		}
	}
	public int add(int a,int b){
		return a+b;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld(args);
		System.out.println(hw);
		System.out.println(hw.add(2,3));
		
	}
}

/**
객체 -> 틀
클래스 -> 틀로 찍어낸 것

class Hw{
	...
}// 객체

Hw hw = new Hw();
hw // 클래스

인자 -> value 즉 값
매개변ㅅ -> 변수 즉 메모리에 할당하는 공간
 */