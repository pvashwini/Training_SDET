package com.training.sdetday3.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStoreAndGet {

	public static void store(Laptop laaptop){
		ObjectOutputStream oos=null;
	
			try {
				 oos =
						new ObjectOutputStream(
						new FileOutputStream("laptop.ser"));
				
				   oos.writeObject(laaptop);
                   oos.writeInt(100);
                   oos.writeChars("hello");
			    } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	
	public static  Laptop getObject(){
		try {
			ObjectInputStream ois =
					new ObjectInputStream(
					new FileInputStream("laptop.ser"));
			
			Laptop laptop = (Laptop) ois.readObject();
			System.out.println(ois.readInt());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.println();
			return laptop;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args){
		Laptop laptop = new Laptop (1234,"Surface Pro","Microsoft");
		//store(laptop);
		System.out.println(getObject());
	}
}
