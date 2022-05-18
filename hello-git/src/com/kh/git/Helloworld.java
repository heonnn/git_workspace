package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.animal.Snake;

public class Helloworld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Dog dog = new Dog();
		dog.bark();
		
		Cat cat = new Cat();
		cat.cry();
		
		Snake snake = new Snake();
		snake.move();
	}

}
