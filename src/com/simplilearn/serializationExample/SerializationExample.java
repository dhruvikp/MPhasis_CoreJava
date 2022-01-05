package com.simplilearn.serializationExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public int a;
	public transient String c;
	
	public Demo(int a, String c) {
		this.a = a;
		this.c = c;
	}
}

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		Demo demo = new Demo(1, "Simplilearn");
		System.out.println("Printing values before serialization");
		System.out.println(demo.a);
		System.out.println(demo.c);
		System.out.println("========================");
		
		String fileName = "file.ser";
		
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(demo);
		
		oos.close();
		fos.close();
		
		System.out.println("Serialization Completed!");
		
		System.out.println("Starting Deserialization!!");
		
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo  deserializedDemo = (Demo)ois.readObject();
		
		System.out.println(deserializedDemo.a);
		System.out.println(deserializedDemo.c);
		
		fis.close();
		ois.close();
		
		

	}

}
