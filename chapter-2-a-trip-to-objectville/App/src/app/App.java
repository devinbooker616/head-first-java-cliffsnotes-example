package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Book favBook = new Book();
        Book favAuthor = new Book();
        Scanner choice1 = new Scanner(System.in);
        Scanner choice2 = new Scanner(System.in);
        System.out.print("What is your favorite book: ");
        favBook.title = choice1.nextLine();
        System.out.print("who is the book by: ");
        favAuthor.author = choice2.nextLine();
        choice1.close();
        choice2.close();

        System.out
                .println("Your favorite book is " + favBook.title + " and your favorite author is " + favAuthor.author);
    }
}