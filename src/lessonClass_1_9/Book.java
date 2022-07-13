package lessonClass_1_9;

public class Book {
    private final String name;
    private final Author author;
    private int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return name;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return name + ", " + author.toString() + ", " + yearPublication;
    }

    public boolean equals(Book book) {
        return this.name.equals(book.name) && this.author.equals(book.author) && this.yearPublication == book.yearPublication;
    }

    public int hashCode() {
        return this.name.hashCode() + this.author.hashCode() + this.yearPublication;
    }
}
