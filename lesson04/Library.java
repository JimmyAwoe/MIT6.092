public class Library {
    // Add the missing implementation to this class
    String LibAddress;
    Book[] books;

    Library(String address){
        this.LibAddress = address;
        books = new Book[0];
    }

    public void addBook(Book newBook){
        Book[] newbooks = new Book[books.length + 1];
        int i;
        for(i = 0; i < newbooks.length; i++){
            if (i != newbooks.length - 1){
                newbooks[i] = books[i];
            } else {
                newbooks[i] = newBook;
            }
        }
        books = newbooks;
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress(){
        System.out.println(this.LibAddress);
    }

    public void borrowBook(String bookname){
        int i;
        for (i = 0; i < books.length; i++){
            if (books[i].title.equals(bookname) && !books[i].borrowed){
                books[i].borrowed = true;
                System.out.println("You successfully borrowed " + bookname);
                return;
            } else if (books[i].title.equals(bookname) && books[i].borrowed){
                System.out.println("Sorry, this book is already borrowed.");
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void printAvailableBooks(){
        int i;
        if (books.length == 0) {
            System.out.println("No book in catalog");
            return;
        }
        for (i=0; i < books.length; i++){
            if (books[i].borrowed){
                continue;
            }
            System.out.println(books[i].title);
        }
        }


    public void returnBook(String bookname){
        int i;
        for (i=0; i < books.length; i++){
            if (books[i].title.equals(bookname)){
                books[i].borrowed = false;
                System.out.println("You successfully returned " + bookname);
            }
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}