package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import java.util.Scanner;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import com.mygdx.game.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {


	public static void main (String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Game.");
		System.out.println("Enter your name");
		String name = scan.nextLine();
		if (name.length() > 20)
		{
			System.out.println("Enter your name again.");
		}

		System.out.println("The controls are W,S,I,K.");
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(144);
		config.setTitle("My GDX Game");
		new Lwjgl3Application(new MyGdxGame(), config);



	}





}
