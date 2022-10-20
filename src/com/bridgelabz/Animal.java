package com.bridgelabz;

class Animal {
	void eat() {
		System.out.println("i am eating ");
	}
}
class dog extends Animal{
	public static void main(String[] args) {
		dog obj1 = new dog ();
		obj1.eat();
	}
}
