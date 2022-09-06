//Define a Java class “BookSeller” and then define a static inner class “Book”,
// and use a static method “sellBooks” to initialize several books,
// and in the main method display all the books by calling the “sellBooks” method

public class BookSeller {

    static class Book {
        public static void sellBooks() {
            System.out.println("Chinese book");
            System.out.println("English book");
            System.out.println("comics book");
            System.out.println("History book");
            System.out.println("Music book");
        }
    }


    public static void main(String[] args) {
        BookSeller.Book book = new BookSeller.Book();
        book.sellBooks();
    }
}