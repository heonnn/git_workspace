package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;

public class Helloworld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Dog dog = new Dog();
		dog.bark();
		
		Cat cat = new Cat();
		cat.cry();
	}

}
