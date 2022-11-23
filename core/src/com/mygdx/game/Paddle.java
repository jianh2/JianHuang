package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Paddle {
    int x;
    int y;
    int size;
    int xSpeed;
    int ySpeed;
    int length;
    int width;

    public Paddle(int x, int y, int length, int width, int ySpeed) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
        this.ySpeed = ySpeed;
    }
    public void update() {

        y += ySpeed;
        if(Gdx.input.isKeyPressed(Input.Keys.W)) {
            ySpeed = 2;
            // your actions
        }
        else if (Gdx.input.isKeyPressed(Input.Keys.S)){
            ySpeed = -2;
        }
        else if (Gdx.input.isKeyPressed(Input.Keys.K)){
            ySpeed = 2;
        }
        else if (Gdx.input.isKeyPressed(Input.Keys.I)){
            ySpeed = -2;
        }

        if (y < 0 || y > Gdx.graphics.getHeight()) {
            ySpeed = -ySpeed;

        }
    }
    public void draw(ShapeRenderer shape) {

        shape.circle(x, y, size);
        shape.rect(10, 60, length, width);

    }
}