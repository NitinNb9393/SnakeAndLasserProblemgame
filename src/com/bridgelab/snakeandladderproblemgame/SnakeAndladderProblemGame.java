package com.bridgelab.snakeandladderproblemgame;

import java.util.Scanner;

public class SnakeAndladderProblemGame {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Snake And ladder Problem Game");
		toSnakeAndladderProblemGame();
		toDice();
		toRandomNumberToCheckOptions();
	}

	public static void toSnakeAndladderProblemGame() {
		int Position = 0;
		System.out.println("Your Starting Position is : " + Position);
	}

	public static void toDice() {
		int toDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Your Dice Value is : " + toDice);
	}

	public static void toRandomNumberToCheckOptions() {
		int position = 0;
		System.out.println("Your Starting Position is : " + position);
		int die = (int) (Math.random() * 10) % 6 + 1;
		System.out.println("dice value is " + die);
		int value = (int) (Math.random() * 10) % 3 + 1;
		System.out.println("case number is " + value);

		switch (value) {
		case 1:
			System.out.println("No Play You are in the same position.");
			break;

		case 2:
			position = (position + die);
			System.out.println("your position after ladder is ::" + position);
			break;

		case 3:
			position = (position - die);

			if (position < 0) {
				position = 0;
			}
			System.out.println("Your Position after snake is::" + position);
			break;
		}

	}
}
