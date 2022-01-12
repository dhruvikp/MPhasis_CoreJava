package com.simplilean.sorting;

import java.util.Scanner;

public class SearchEmailId {

	public static void main(String[] args) {
		
		String[] emailIds = {"dhruvik@simplilaern.com" , "vinay@emphasis.com", "chaitanya@emphasis.com"};
		
		Scanner sc  = new Scanner(System.in);

		while(true) {
			String emailId = sc.next();
			System.out.println(SearchEmailId.search(emailIds, emailId));
		}
		
		

	}
	
	static boolean search(String[] emailIds, String emailId) {
		
		for(String e : emailIds) {
			if(e.equals(emailId))  {
				return true;
			}
		}
		return false;
	}

}
