package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * This is a class that represents the game ball
 */
public class Ball {
    /** This is the x coordinate */
    int x;
    /** This is the y coordinate */
    int y;
    /** This is the size of the ball */
    int size;
    /** This is the speed of the ball on the x-axis */
    int xSpeed;
    /** This is the speed of the ball on the y-axis */
    int ySpeed;
    /** This is the amount of points player 1 has */
    int point1;
    /** This is the amount of points player 2 has */
    int point2;
    /** This is player 1's name*/
    String player1;
    /** This is the player 2's name */
    String player2;

    /** Default parameter constructor that sets ball to (300,300), x and y speed to 5, player 1 to "Player 1", and player 2 to "Player 2"
     *
     */
    public Ball() {
        this.x = 300;
        this.y = 300;
        this.size = 12;
        this.xSpeed = 5;
        this.ySpeed = 5;
        this.player1 = "Player 1";
        this.player2 = "Player 2";
    }
    /** 7 parameter constructor that sets the speed of the ball, the position, and the names of both players
     * @param x represents the x position
     * @param y represents the y position
     * @param size represents the size of the ball
     * @param xSpeed represents the speed of the ball on the x-axis
     * @param ySpeed represents the speed of the ball on the y-axis
     * @param player1 represents the name of player 1
     * @param player2 represents the name of player 2
     */
    public Ball(int x, int y, int size, int xSpeed, int ySpeed, String player1, String player2) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.player1 = player1;
        this.player2 = player2;
    }


    /** The update method constantly checks for which player has scored a point and prints the score. It also checks whether the ball has to bounce from hitting the top or bottom of the screen
     */
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

    /** The draw method is used to draw the ball shape on the screen
     *
     * @param shape takes in an object from the ShapeRenderer class.
     */
    public void draw(ShapeRenderer shape) {
        shape.circle(x, y, size);
    }

    /** The yGetter method will return the current y position of the ball
     *
     * @return an integer value of the y position of the ball.
     */
    public int yGetter()
    {
        return y;
    }
    /** The xGetter method will return the current x position of the ball
     *
     * @return an integer value of the x position of the ball.
     */
    public int xGetter()
    {
        return x;
    }
    /** The ySpeedGetter method will return the current speed of the ball on the y-axis
     *
     * @return an integer value of the current speed of the ball on the y-axis
     */
    public int ySpeedGetter()
    {
        return ySpeed;
    }
    /** The xSpeedGetter method will return the current speed of the ball on the x-axis
     *
     * @return an integer value of the current speed of the ball on the x-axis
     */
    public int xSpeedGetter()
    {
        return xSpeed;
    }
    /** The ySpeedSetter method will change the speed of the ball on the y-axis by changing the ySpeed variable.
     */
    public void ySetter(int speed)
    {
        ySpeed = speed;
    }
    /** The xSpeedSetter method will change the speed of the ball on the x-axis by changing the xSpeed variable.
     */
    public void xSetter(int speed)
    {
        xSpeed = speed;
    }
}

