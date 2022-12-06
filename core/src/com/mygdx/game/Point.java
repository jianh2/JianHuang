package com.mygdx.game;
import java.util.Scanner;
public class Point {
    private String player1;
    private String player2;

    public Point() {
    }
    public void askPlayer1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Player 1's Name: ");
        this.player1 = scan.nextLine();
        if (player1.length() > 20) {
            System.out.print("Enter Player One's name again:");
            this.player1 = scan.nextLine();
        }
    }
    public void askPlayer2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Player 2's Name: ");
        this.player2 = scan.nextLine();
        if (player2.length() > 20) {
            System.out.print("Enter Player Two's name again:");
            this.player2 = scan.nextLine();
        }
    }

    public String getPlayer2() {
        return player2;
    }
    public String getPlayer1() {
        return player1;
    }
}
