package libarysystem;

import java.util.Scanner;
import java.util.ArrayList;

public class LibarySystem {
    
    
    public static Scanner input = new Scanner(System.in);
    
    public static ArrayList<Books> bookList = new ArrayList<>();
    

    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        try{
        
            System.out.println("Please enter a menu choice:\n\n1 - Book options\n2 - Borrower Options\n3 - Exit\n\n:");

            int userChoice = input.nextInt();
            
            switch(userChoice){
                
                case 1:
                    bookOptions();
                    break;
                case 2:
                    borrowerOptions();
                    break;
                case 3:
                    break;
                    
                default:
                    System.out.println("\nPlease enter a valid menu option...");
                    menu();
                    break;
            }
        }
        catch(Exception error){
            System.out.println("Error: "+error);
            input.next();
            menu();
        }
    }
    
    public static void bookOptions(){
        try{
            
            System.out.println("\n1 - Add book\n2 - Remove book\n3 - Show list of added books\n4 - Edit a book\n\n5 - Leave menu option\n\n: ");
            
            int userChoice = input.nextInt();
            
            switch(userChoice){
                
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    addedBooks();
                    break;
                case 4:
                    editBook();
                    break;
                case 5:
                    menu();
                    break;
                
                default:
                    System.out.println("\nPlease enter a valid menu option...");
                    bookOptions();
                    break;
                
            }
        }
        catch(Exception error){
            System.out.println("Error: "+error);
            input.next();
            bookOptions();
        }
    }
    
    public static void borrowerOptions(){
        
        
    }
    
    
    
    
    public static void addBook(){
        try{
            System.out.println("Book name: ");
            String bookName = input.next();
           
            input.next();
            
            System.out.println("Bookshelf book is located on: ");
            int bookcaseIndex = input.nextInt();
            
            System.out.println("Book price: ");
            double bookPrice = input.nextDouble();
            
            Books newBook = new Books(bookName, bookcaseIndex, bookPrice);
            
            bookList.add(newBook);
            
            System.out.println("New book '"+bookName+"' added.");
            
            bookOptions();
        }
        catch(Exception error){
            System.out.println("Error: "+error);
            input.next();
            bookOptions();
        }
    }
    public static void addedBooks(){
        for(int i = 0; i < bookList.size(); i++){
            System.out.println("Name: "+bookList.get(i).bookName+" | Shelf: "+bookList.get(i).bookcaseIndex+" | Book Price: £"+bookList.get(i).bookPrice);
        }
        bookOptions();
    }
    public static void removeBook(){
        try{
            System.out.println("Please enter the exact bookname to remove: ");
            
            String bookName = input.next();
            
            for(int i = 0; i < bookList.size(); i++){
                if(bookName.equals(bookList.get(i).bookName)){
                    bookList.remove(i);
                    
                    System.out.println("Book successfully found and deleted!");
                    bookOptions();
                } 
            }
            System.out.println("Book not found...");
            bookOptions();
        }
        catch(Exception error){
            System.out.println("Error: "+error);
            input.next();
            bookOptions();
        }
        
    }
    public static void editBook(){
        try{
            System.out.println("Name of book you want to edit: ");
            
            String bookName = input.next();
            
            for(int i = 0; i < bookList.size(); i++){
                if(bookName.equals(bookList.get(i).bookName)){
                    System.out.println("Book found! What would you like to edit?\n\n1 - Book name\n2 - Book shelf\n3 - Book price\n\n4 - Leave menu option\n\n: ");
                    
                    int userChoice = input.nextInt();
                    
                    switch(userChoice){
                        
                        case 1:
                            System.out.println("New book name: ");
                            String newBookName = input.next();
                            
                            bookList.get(i).bookName = newBookName;
                            bookOptions();
                            break;
                        
                        case 2:
                            System.out.println("New book shelf index: ");
                            int newBookcaseIndex = input.nextInt();
                            
                            bookList.get(i).bookcaseIndex = newBookcaseIndex;
                            bookOptions();
                            break;
                            
                        case 3:
                            System.out.println("New book price: ");
                            double newBookPrice = input.nextDouble();
                            
                            bookList.get(i).bookPrice = newBookPrice;
                            bookOptions();
                            break;
                            
                        case 4:
                            bookOptions();
                            break;
                            
                        default:
                            System.out.println("Please enter a valid menu option...");
                            input.next();
                            editBook();
                    }
                    
                }
                
            }
            System.out.println("Book not found...");
            bookOptions();
        }
        catch(Exception error){
            System.out.println("Error: "+error);
            input.next();
            bookOptions();
        }
        
    }
    
    
    
    
    
}
