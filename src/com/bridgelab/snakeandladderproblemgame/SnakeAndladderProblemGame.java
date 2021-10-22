package com.bridgelab.snakeandladderproblemgame;

import java.util.Scanner;

public class SnakeAndladderProblemGame {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Snake And ladder Problem Game");

		toSnakeAndladderProblemGame();
		toDice();
		toRandomNumberToCheckOptions();
		toPlayerReachToposition();
		toWinningPosition();
	}

	public static void toWinningPosition() {

		final int WINNING_POSITION = 100;
		final int IS_LADDER = 1;
		final int IS_SNAKE = 0;
		{
			int startPosition = 0;
			System.out.println("Player staring position is : " + startPosition);

			int position = 0;

			while (position < WINNING_POSITION) {

				int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
				System.out.println("diceNumber is : " + diceNumber);

				int option = (int) Math.floor(Math.random() * 10) % 2;
				System.out.println("selected player option : " + option);

				if (option == IS_SNAKE) {
					System.out.println("Snake for the Player");
					if (position - diceNumber > 0) {
						position = position - diceNumber;
						System.out.println("Position for the Player after the snake : " + position);
					}
				} else if (option == IS_LADDER) {
					System.out.println("Ladder for the Player");
					if (position + diceNumber <= 100) {
						position = position + diceNumber;
						System.out.println("Position for the Player after the snake : " + position);
					}

				}
			}
		}
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

	public static void toPlayerReachToposition() {
		int startPosition = 0;
		System.out.println("Player staring position is : " + startPosition);

		int NO_PLAY = 0;
		int is_Ladder = 1;
		int is_Snake = 2;
		int position = 0;

		while (position < 100) {

			int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
			System.out.println("diceNumber is : " + diceNumber);

			int option = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("selected player option : " + option);

			switch (option) {
			case 1:
				position = diceNumber + position;
				System.out.println("position for the player after the ladder is : " + position);
				break;

			case 2:
				position = position - diceNumber;
				if (position < 0) {
					position = 0;
				}

				System.out.println("position for the player after the Snake is : " + position);
				break;

			default:
				System.out.println("No play");
			}
		}

	}
}
