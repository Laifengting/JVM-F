package com.atguigu.java2;

import org.junit.Test;

/**
 * @author shkstart  shkstart@126.com
 * @create 2020  20:17
 */
public class StringExer1 {
	public static void main(String[] args) {
		
		// String s = new String("a") + new String("b");//new String("ab")
		// //在上一行代码执行完以后，字符串常量池中并没有"ab"
		//
		// String x = "ab";
		//
		// String s2 = s.intern();    //jdk6中：在串池中创建一个字符串"ab"
		// //jdk7/8中：串池中没有创建字符串"ab",而是创建一个引用，指向new String("ab")，将此引用返回
		// System.out.println(s2 == "ab");//jdk6:true  jdk8:true
		// System.out.println(s == "ab");//jdk6:false  jdk8:true
		
		String s = new String("1") + new String("2");
		s.intern();
		String s2 = "12";
		System.out.println(s == s2); // true
	}
	
	@Test
	public void test07() {
		String s = new String("1") + new String("2");
		s.intern();
		String s2 = "12";
		System.out.println(s == s2); // false
	}
}
