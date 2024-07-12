package Exercise;

//Question:-
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

class Library{
    int no_of_books;
    String [] books;
    Library() {
        this.no_of_books=0;  //initialized with zero-th index
        this.books = new String[100];
    }
    void addBook(String book) {
        this.books[no_of_books] = book; //this.book array[0] = input book
        no_of_books++;
        System.out.println(book + " has been added!");
    }
    void showAvailableBooks() {
        System.out.println("The available books are:- ");
        for(String book: this.books){
            if(book==null) {
                continue; //break will ignore other books available after issuing a book
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book) {
            for(int i=0; i<this.books.length; i++) {
                if (this.books[i]==book) {
                    System.out.println(book + " has been issued.");
                    this.books[i] = null;
                    return;
                }
            }
            System.out.println(book + " is not available.");
        }

    void returnBook(String book) {
        addBook(book);
    }
}
    
public class Ex4_Library {
    public static void main(String[] args) {

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Python");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        centralLibrary.issueBook("Power");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}


