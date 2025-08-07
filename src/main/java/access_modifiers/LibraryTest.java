package access_modifiers;

public class LibraryTest {
    public static void main(String[] args) {

        Library book1 = new Library();

        // no access bcs of private modifier
        // book1.bookTitle = "harry potter";

         book1.author = "test333";
         System.out.println(book1.author);

         book1.year = 1995;
         System.out.println(book1.year);

         book1.category = "bestsellers";
         System.out.println(book1.category);

         book1.setBookTitle("title444");
         book1.author = "Rowling";
         System.out.println(book1.getBookTitle());
    }
}
