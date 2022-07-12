package lessonClass_1_9;

import com.sun.tools.javac.Main;


public class App {
    public static void main(String[] args) {
        Book myBook;
        Book myBook2;
        Author myAuthor1;
        Author myAuthor2;
        myAuthor1 = new Author("Лев", "Толстой");
        myAuthor2 = new Author("Борис", "Полевой");
        myBook = new Book("Война и мир", myAuthor1, 1991);
        myBook2 = new Book("Повесть о настоящем человеке", myAuthor2, 1990);
        System.out.println("myBook.getName() = " + myBook.getName());
        System.out.println("myBook.getYearPublication() = " + myBook.getYearPublication());
        System.out.println("myBook.getAuthorName() = " + myBook.getAuthorName());
        System.out.println("myBook.getAuthorSurname() = " + myBook.getAuthorSurname());

        myBook.setYearPublication(2000);
        System.out.println("myBook.getYearPublication() = " + myBook.getYearPublication());

    }
}