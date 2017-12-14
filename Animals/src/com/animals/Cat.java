package com.animals;

public class Cat extends Animal {

	@Override
	public byte getNumberOflegs() {
		return 4;
	}

	@Override
	public boolean isMammal() {
		return true;
	}

	@Override
	public String sound() {
		return "meow";
	}

	@Override
	public Category getCategory() {
		return Category.MAMMAL;
	}

}
