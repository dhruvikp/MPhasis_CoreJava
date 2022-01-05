package com.simplilearn.exceptionhandling;



class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}




public class TestCustomException {

	void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException();
		}
		System.out.println("Age is perfect!");
	}
	
	
	
	public static void main(String[] args) {
		TestCustomException obj = new TestCustomException();
		try {
			
			obj.validateAge(17);
			
			
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		//List<Employee> list;
		//ID

	}

}
