package com.udemy.squarecube;

public class SquareCube {

	private int number;

	SquareCube() {
	}

	SquareCube(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void squareUpToNumber() {
		int i = 0;
		while (i <= this.number) {
			int square = i * i;
			if (square <= this.number) {
				System.out.print(square + " ");
			} else {
				break;
			}
			i++;

		}

	}

	public void cubeUpToNumber() {
		int i = 0;
		while (i * i * i <= this.number) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}
}
