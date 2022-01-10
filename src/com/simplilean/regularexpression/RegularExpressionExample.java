package com.simplilean.regularexpression;

import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		
		
		System.out.println(Pattern.matches("[a-z]+", "dhruvik"));
		
		
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.]+@(.+)$", "dhruvik@simplilean.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.]+@(.+)$", "dhruvik#simplilean.com"));
	}

}
