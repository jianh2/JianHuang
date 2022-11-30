package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Ball {
    int x;
    int y;
    int size;
    int xSpeed;
    int ySpeed;
    int point;
    public Ball(int x, int y, int size, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void update() {
        x += xSpeed;
        y += ySpeed;
        int randomStart = (int) (Math.random() * 150) + 250;
        if (x < 0) {

            point++;
            System.out.print("Bounces:" + point);

        }
        if (x < 0 || x > Gdx.graphics.getWidth()) {

            xSpeed = -xSpeed;


        }
        if (y < 0 || y > Gdx.graphics.getHeight()) {
            ySpeed = -ySpeed;
        }
    }


    public void draw(ShapeRenderer shape) {
        shape.circle(x, y, size);
    }
    public int yGetter()
    {
        return y;
    }

    public int xGetter()
    {
        return x;
    }

    public int ySpeedGetter()
    {
        return ySpeed;
    }

    public int xSpeedGetter()
    {
        return xSpeed;
    }
    public void ySetter(int speed)
    {
        ySpeed = speed;
    }

    public void xSetter(int speed)
    {
        xSpeed = speed;
    }
//    public void collide()
//    {
//        if (xGetter() == paddle.xGetter());
//    }
}

