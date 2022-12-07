package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/** This class represents the paddles used by the two players
 *
 */
public class Paddle {
    /** This is the x coordinate */
    int x;
    /** This is the y coordinate */
    int y;
    /** This is the size of the rectangle shape of the paddle */
    private double size;
    /** This is the speed of the paddle on the y-axis */
    int ySpeed;
    /** This is the length of the paddle */
    int length;
    /** This is the width of the paddle */
    int width;

    /** This is the 5 parameter constructor that sets the position of the paddle, dimensions of the paddle and the speed on the y-axis
     *
     * @param x represents the x position of the paddle
     * @param y represents the y position of the paddle
     * @param length represents the length of the paddle
     * @param width represents the width of the paddle
     * @param ySpeed represents the speed of the paddle on the y-axis
     */
    public Paddle(int x, int y, int length, int width, int ySpeed) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
        this.ySpeed = ySpeed;
    }

    /** This update method checks for a user input to see whether the paddle should be moved up or down for player 1
     *
     */
    public void update() {

        y += ySpeed;
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            ySpeed = 10;
            // your actions
        } else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            ySpeed = -10;

        }else if(y== 50 || y == 600) {
        ySpeed = 0;
    }
        else {
            ySpeed = 0;
        }

        if (y <= 0 || y > Gdx.graphics.getHeight()) {
            ySpeed = -ySpeed;

        }


    }
    /** This update method checks for a user input to see whether the paddle should be moved up or down for plaeyer 2
     *
     */
    public void update2() {

        y += ySpeed;
        if (Gdx.input.isKeyPressed(Input.Keys.K)){
            ySpeed = -10;
        }
        else if (Gdx.input.isKeyPressed(Input.Keys.I)){
            ySpeed = 10;
        }
        else if(y == 50 || y == 600) {
            ySpeed = 0;
        }
        else {
            ySpeed = 0;
        }

        if (y < 0 || y > Gdx.graphics.getHeight()) {
            ySpeed = -ySpeed;

        }
    }
    /** This draw method renders the paddle on the window
     * @param shape is an object from the ShapeRenderer class
     */
    public void draw(ShapeRenderer shape) {


        shape.rect(x,y,length, width);

    }

    /** This yGetter method is used to return the y position of the paddle
     *
     * @return an integer value of the y position of the paddle
     */
    public int yGetter()
    {
        return y;
    }
    /** This xGetter method is used to return the x position of the paddle
     *
     * @return an integer value of the x position of the paddle
     */
    public int xGetter()
    {
        return x;
    }
}