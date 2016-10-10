package designmode.原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型的变量，指向的还是原对象所指向的。（对象本身会重新创建）
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * @author panqian
 *
 */
public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String string;
	
	

	public Prototype(String string) {
		this.string = string;
		this.object = new SerializableObject();
	}


	private SerializableObject object;
	
	/**
	 * 浅复制
	 * @return
	 * @throws CloneNotSupportedException 
	 */
	public Object clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
	
	public Object deepclone() throws CloneNotSupportedException, ClassNotFoundException, IOException{
	
		ByteArrayOutputStream byteoutStream = new ByteArrayOutputStream();
		ObjectOutputStream objoutStream = new ObjectOutputStream(byteoutStream);
		objoutStream.writeObject(this);
		
		ByteArrayInputStream byteinputStream = new ByteArrayInputStream(byteoutStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteinputStream);
		
		return objectInputStream.readObject();
	}
	
	public String getString() {
		return string;
	}



	public void setString(String string) {
		this.string = string;
	}



	public SerializableObject getObject() {
		return object;
	}



	public void setObject(SerializableObject object) {
		this.object = object;
	}



	class SerializableObject implements Serializable{

		private static final long serialVersionUID = 1L;
		
	}
	
}
