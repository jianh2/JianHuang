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

public class MyGdxGame extends ApplicationAdapter {
	ShapeRenderer shape;
	Ball ball;
	Paddle paddle1;
	ArrayList<Ball> balls = new ArrayList<>();
	Random r = new Random();
	@Override
	public void create() {
		shape = new ShapeRenderer();
		ball = new Ball(0, 0, 25, 15, 15);
		paddle1 = new Paddle(10,50,10,20,5);
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		ball.update();
		shape.begin(ShapeRenderer.ShapeType.Filled);
		ball.draw(shape);
		shape.end();
		shape.begin(ShapeRenderer.ShapeType.Filled);
		for (Ball ball : balls) {
			ball.update();
			ball.draw(shape);
		}
		shape.end();
	}



}