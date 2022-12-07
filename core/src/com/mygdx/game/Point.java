package com.mygdx.game;
import java.util.Scanner;

/** This class represents all the Players that have points
 *
 */
public class Point {
    /** This represents the name of player 1 */
    private String player1;
    /** This represents the name of player 2 */
    private String player2;

    /** Default constructor that doesn't give any attributes
     *
     */
    public Point() {
    }

    /** The askPlayer1 method asks for the player 1's name and sets the variable player1 to the user input
     *
     */
    public void askPlayer1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Player 1's Name: ");
        this.player1 = scan.nextLine();
        if (player1.length() > 20) {
            System.out.print("Enter Player One's name again:");
            this.player1 = scan.nextLine();
        }
    }
    /** The askPlayer2 method asks for the player 2's name and sets the variable player2 to the user input
     *
     */
    public void askPlayer2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Player 2's Name: ");
        this.player2 = scan.nextLine();
        if (player2.length() > 20) {
            System.out.print("Enter Player Two's name again:");
            this.player2 = scan.nextLine();
        }
    }

    /** The toString method returns the name of player1
     *
     * @return name of player 1
     */
    public String toString() {
        return player1;
    }

    /** The getPlayer2 method returns the name of player2
     *
     * @return the name of player 2
     */
    public String getPlayer2() {
        return player2;
    }
}
