//Given a database table “Book” with columns (id, isbn, name, author, publish date),
// define a java class that matches this table and then use a static block to initialize
// this table with some records

public class Book {
    static int id;
    static int isbn;
    static String author;
    static String publishDate;


    static {
        id = 0001;
        isbn = 123456789;
        author = "xinyu wang";
        publishDate = "08/25/2022";

        System.out.println(id);
        System.out.println(isbn);
        System.out.println(author);
        System.out.println(publishDate);
    }


    public static void main(String[] args){
        Book book = new Book();
    }
}
