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
}
public class Ex01 {
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld(args);
		System.out.println(hw);
	}
}
