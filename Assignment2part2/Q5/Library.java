package Assignment2part2.Q5;

import java.util.HashMap;
import java.util.Scanner;

class Book{
    int id;
    String name;
    String author;
    int quantity;
    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
    }
}

public class Library {
    public static void main(String[] args) {
        HashMap<Integer,Book> booksmap=new HashMap<>();
        Book b1=new Book(1,"Java","ABC",10);
        Book b2=new Book(2,"Python","XYZ",15);
        booksmap.put(1,b1);
        booksmap.put(2,b2);

        //display all books

        for(Book book:booksmap.values()){
            System.out.println(book);
        }
        //to find the book 

        System.out.println("Enter the Book to be searched:");
        Scanner sc=new Scanner(System.in);
        String found=sc.nextLine();

        for (Book book : booksmap.values()) {
            if (book.name.equals(found)) {
                System.out.println("Found Book");
            }
            else{
                System.out.println("Book not found");
            }
        }

        // to remove book

        booksmap.remove(1);

        //final display of books 

        for(Book book:booksmap.values()){
            System.out.println(book);
        }

        sc.close();
    }   
}
    

