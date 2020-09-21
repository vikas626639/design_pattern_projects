package com.nit.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nit.dp.Singleton;

public class Serialize_printer {
	public static void doSerialize(Object obj) {
		ObjectOutputStream ois=null;
		try {
			ois=new ObjectOutputStream(new FileOutputStream("abc.txt"));
			ois.writeObject(obj);
			ois.close();
			System.out.println("object serialized");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("couse internal error");
		}
	}

	public static Object dodeserialize() {
		ObjectInputStream ois=null;
		Object obj=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("abc.txt"));
			obj=ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
