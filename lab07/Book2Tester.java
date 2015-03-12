package lab07;

import java.util.Scanner;

public class Book2Tester
{
    private Scanner keyboard = new Scanner(System.in);

    private String getBookTitle()
    {
        String input = "";
        System.out.print("Enter the book's title: ");
        input = keyboard.nextLine();
        while(input.trim().length() == 0)
        {
            System.out.print("That was a blank line, " +
                    "please enter the book's title " +
                    "(The red button ends the program): ");
            input = keyboard.nextLine();
        }
        return input;
    }

    private int getPageCount()
    {
        System.out.print("Enter the number of pages in the book: ");
        boolean numPgOK = false;
        int numPgs = 0;
        while(!numPgOK) //see NOTE on next page
        {
            String input = keyboard.nextLine();
            Scanner lineScan = new Scanner(input);
            if(lineScan.hasNextInt())
            {
                numPgs = lineScan.nextInt();
                if(numPgs > 0)
                {
                    numPgOK = true;
                }
            }
            if(!numPgOK)
            {
                System.out.println("You need to enter a positive int " +
                        "for the number of pages");
                System.out.print("Please enter the number of " +
                        "pages in the book: ");
            }
            lineScan.close();
        }
        return numPgs;
    }

    public boolean getMoreBooks()
    {
        String input = "";
        System.out.print("Are there more books to enter(Y/N)? ");
        input = keyboard.nextLine();
        while(input.length() == 0 || (input.toUpperCase().charAt(0) != 'Y'
                && input.toUpperCase().charAt(0) != 'N'))
        {
            System.out.print("You must respond with Y or N," +
                    "are there more books to enter (Y/N)?: ");
            input = keyboard.nextLine();
        }
        return input.toUpperCase().charAt(0) == 'Y';
    }

    private boolean getRequired()
    {
        String input = "";
        System.out.print("Is the book required (Y/N)? ");
        input = keyboard.nextLine();
        while(input.length() == 0 || (input.toUpperCase().charAt(0) != 'Y'
                && input.toUpperCase().charAt(0) != 'N'))
        {
            System.out.print("You must respond with Y or N," +
                    "is the book required (Y/N)?: ");
            input = keyboard.nextLine();
        }
        return input.toUpperCase().charAt(0) == 'Y';
    }

    public Book2 getBook()
    {
        System.out.println("Information about a new book:");
        String title = getBookTitle();
        int pageCount = getPageCount();
        boolean reqd = getRequired();
        return new Book2(title, pageCount, reqd, 0);
    }

    public static void main(String[] args)
    {
        Book2Tester tester = new Book2Tester();
        System.out.println(tester.getBook());
    }
}