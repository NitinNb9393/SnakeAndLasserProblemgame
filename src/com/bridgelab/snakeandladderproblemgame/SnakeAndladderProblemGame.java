package com.bridgelab.snakeandladderproblemgame;

import java.util.Scanner;

public class SnakeAndladderProblemGame {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Snake And ladder Problem Game");
		toSnakeAndladderProblemGame();
		toDice();
	}

	public static void toSnakeAndladderProblemGame() {
		int Position = 0;
		System.out.println("Your Starting Position is : " + Position);
	}

	public static void toDice() {
		int toDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("Your Dice Value is : " + toDice);
	}
}
