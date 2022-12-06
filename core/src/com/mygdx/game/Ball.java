package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Ball {
    int x;
    int y;
    int size;
    int xSpeed;
    int ySpeed;

    int point1;

    int point2;

    String player1;
    String player2;

    public Ball(int x, int y, int size, int xSpeed, int ySpeed, String player1, String player2) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.player1 = player1;
        this.player2 = player2;
    }
    public void update() {
        x += xSpeed;
        y += ySpeed;
        int randomStart = (int) (Math.random() * 50) + 250;

        if (x >= Gdx.graphics.getWidth()) {


            x = 300;
            y = randomStart;
            point1++;
            System.out.println(player1 + ": " + point1 + " "  + player2 + ": " + point2);



        }
        if (x <= 0 ) {

            x = 300;
            y = randomStart;
            point2++;
            System.out.println(player1 + ": " + point1 + " " + player2 + ": " + point2);


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

