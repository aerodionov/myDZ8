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

    public String getAuthorName() {
        return author.getNameAuthor();
    }

    public String getAuthorSurname() {
        return author.getSurnameAuthor();
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
