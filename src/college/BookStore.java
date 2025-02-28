package college;
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String isbn;

    //property-method
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }

    //constructor
    public Book(String title, String author, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    //method to display book
    public String toString(){
        return " ---> Book name : "+title+", Book author : "+author+", Book ISBN : "+isbn;
    }
}
public class BookStore {

    //properties
    private Book[] books = new Book[2]; //array to store books
    private int count = 0; //no of books in store
    private Scanner sc = new Scanner(System.in);

    //constructor to initialise the array and scanner
//    public BookStore(){
//        books = new Book[2];
//        count = 0;
//        sc = new Scanner(System.in);
//    }

    //add book in store
    public void addBook(){
        if(count>=books.length){ //checking no of books are not greater than store limit
            System.out.println("\n ---> Store is full. Can't add more books..!!");
            return;
        }

        //input book's detail
        System.out.print("\nEnter book title : ");
        String title = sc.nextLine();
        System.out.print("Enter book author : ");
        String author = sc.nextLine();
        System.out.print("Enter book isbn : ");
        String isbn = sc.nextLine();

        //initialising the object and assigning to the array
        books[count++] = new Book(title, author, isbn);

        System.out.println("\n ---> Book added successfully..!!");
    }

    //remove book from store via ISBN
    public void removeBook(){
        if(count==0){
            System.out.println("\n ---> No book in store..!!");
            return;
        }

        System.out.print("\nEnter ISBN of book : ");
        String isbn = sc.nextLine();

        for(int i=0; i<count; i++){
            if(books[i].getIsbn().equals(isbn)){
                for(int j=i; j<count-1; j++){
                    books[j] = books[j+1];
                }
                books[--count] = null; // clear last element and decrease no of books
                System.out.println("\n ---> Book removed successfully..!!");
                return;
            }
        }
        System.out.println("\n ---> Book not found..!!");
    }

    //display books
    public void displayBooks(){
        if(count==0){
            System.out.println("\n ---> No book in store..!!");
            return;
        }
        System.out.println();
        for(int i=0; i<count; i++){
            System.out.println(books[i]);
        }

    }

    //main method
    public static void main(String[] args) {
        BookStore bs = new BookStore();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Display books");
            System.out.println("4. Exit");

            System.out.print("Choose an option from above : ");
            byte choice = sc.nextByte();

            switch(choice){
                case 1 -> bs.addBook();
                case 2 -> bs.removeBook();
                case 3 -> bs.displayBooks();
                case 4 -> {
                    System.out.println("\n ---> Exiting from program.....");
                    sc.close();
                    return; //to exit the main method and  terminate program
                }
                default -> System.out.println("\n ---> Invalid option..!!");
            }


        }

    }
}