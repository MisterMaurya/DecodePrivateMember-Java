package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import beans.MyPrivateMembers;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class class1 = null;

		MyPrivateMembers obj1 = null;
		class1 = Class.forName("beans.MyPrivateMembers");

		Constructor[] constructor = class1.getDeclaredConstructors();
		constructor[0].setAccessible(true);
		MyPrivateMembers constructors = (MyPrivateMembers) constructor[0].newInstance();

		Method[] method = class1.getDeclaredMethods();
		method[0].setAccessible(true);
		method[0].invoke(constructors, null);

		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			System.out.println(field.get(constructors));
		}

	}
}
