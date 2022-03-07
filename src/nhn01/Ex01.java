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

/*

///* 클래스 
public class Animal {
  ...
}
///* 객체와 인스턴스 
public class Main {
  public static void main(String[] args) {
    Animal cat, dog; // '객체'

    // 인스턴스화
    cat = new Animal(); // cat은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
    dog = new Animal(); // dog은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
  }
}
https://gmlwjd9405.github.io/2018/09/17/class-object-instance.html

인자 -> value 즉 값
매개변ㅅ -> 변수 즉 메모리에 할당하는 공간
 */