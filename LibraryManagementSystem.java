import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    static class Book{
        String title;
        String author;
        int id;

        Book(String title , String author , int id){
            this.title = title;
            this.author = author;
            this.id = id;
        }

        void displayBook(){
            System.out.println("TITLE: " + title);
            System.out.println("AUTHOR: " + author);
            System.out.println("ID: " + id);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> b = new ArrayList<>();

    boolean running = true;
    while (running){
        System.out.println("====================LIBRARY MENU====================");
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Exit");

        System.out.println("ENTER YOUR CHOICE: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 3){
            running = false;
            System.out.println("PROGRAM EXITED");
            }

        if (choice == 1){
            String title;
            System.out.println("ENTER BOOK TITLE: ");
            title = sc.nextLine();

            String author;
            System.out.println("ENTER AUTHOR NAME: ");
            author = sc.nextLine();

            int id;
            System.out.println("ENTER ID: ");
            id = sc.nextInt();
            sc.nextLine();

            Book b1 = new Book(title , author , id);
            b.add(b1);
            System.out.println("BOOK ADDED SUCCESSFULLY.");
            }

        if(choice == 2){
            for (int i = 0 ; i<b.size() ; i++){
                System.out.println("====================== BOOK REPORT ======================");
                b.get(i).displayBook();
                }
            }
        }
    }
}
