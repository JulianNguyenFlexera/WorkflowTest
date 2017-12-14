package com.animals;

public class Kangaroo extends Animal {

	@Override
	public byte getNumberOflegs() {
		return 2;
	}

	@Override
	public boolean isMammal() {
		return false;
	}

	@Override
	public String sound() {
		return "";
	}

}
