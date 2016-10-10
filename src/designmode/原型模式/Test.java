package designmode.原型模式;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Prototype prototype = new Prototype("pan");
		Prototype clone;
		Prototype deepclone;
		
		clone = (Prototype) prototype.clone();
		deepclone = (Prototype) prototype.deepclone();
		
		clone.setString("clone");
		deepclone.setString("deepclone");
		
		System.out.println("prototype:"+ prototype.getString() +" SerializableObject:"+ prototype.getObject());
		System.out.println("clone:"+ clone.getString()+" SerializableObject:"+ clone.getObject());
		System.out.println("deepclone:"+ deepclone.getString()+" SerializableObject:"+ deepclone.getObject());
		
	}
}
