package com.mygdx.game;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.GL20;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyGdxGame extends ApplicationAdapter {
	ShapeRenderer shape;
	ShapeRenderer shape2;
	Ball ball;
	Paddle paddle1;
	Paddle paddle2;
	ArrayList<Ball> balls = new ArrayList<>();
	Random r = new Random();
	@Override
	public void create() {
		Point pointSystem = new Point();
		pointSystem.askPlayer1();
		pointSystem.askPlayer2();
		shape = new ShapeRenderer();
		ball = new Ball(0, 0, 12, 5, 5, pointSystem.getPlayer1(), pointSystem.getPlayer2());
		paddle1 = new Paddle(0,60,25,100,50);
		paddle2 = new Paddle(Gdx.graphics.getWidth() -30,50,25,100,5);
	}



	@Override
	public void render() {

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if (paddle2.xGetter()  <= ball.xGetter() && paddle2.xGetter() + 30 >= ball.xGetter() && paddle2.yGetter() - 20 <= ball.yGetter() && paddle2.yGetter() + 120 >= ball.yGetter()  ) {
			ball.xSetter((ball.xSpeedGetter() * -1));

		}


		else if (paddle1.xGetter()  <= ball.xGetter() && paddle1.xGetter() + 30 >= ball.xGetter() && paddle1.yGetter() - 20 <= ball.yGetter() && paddle1.yGetter() + 120 >= ball.yGetter()  ) {
			ball.xSetter((ball.xSpeedGetter() * -1));


		}
		ball.update();
		shape.begin(ShapeRenderer.ShapeType.Filled);
		ball.draw(shape);
		paddle1.draw(shape);
		paddle2.draw(shape);
		shape.end();
		paddle1.update();
		paddle2.update2();




	}



}