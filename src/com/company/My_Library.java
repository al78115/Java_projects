package com.company;

class Library {
    String[] books;
    int no_of_books;
    private String book;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void showAvailableBooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }

    void issueBook(String book){
        for (int i=0; i<this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("the book has been issued");
                this.books[i] = null;
                return;
            }
            System.out.println("this book does not exist");
        }

    }
        void returnBook(String book){
            this.book=book;
            addBook(book);

        }

}

public class My_Library {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.showAvailableBooks();
        lb.addBook("Brotherhood");
        lb.addBook("Names of frames");
        lb.addBook("Hell of the Past");
        lb.addBook("Succession process");
        lb.addBook("life of joy");
        lb.showAvailableBooks();


        lb.issueBook("Brotherhood");
      lb.showAvailableBooks();
    }
}


