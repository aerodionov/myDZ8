package lessonClass_1_9;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author (String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    @Override
    public String toString() {
        return nameAuthor + " " + surnameAuthor;
    }

    public Boolean equals(Author author) {
        return this.nameAuthor.equals(author.nameAuthor) && this.surnameAuthor.equals(author.surnameAuthor);
    }

    public int hashCode() {
        return this.nameAuthor.hashCode() + this.surnameAuthor.hashCode();
    }


}
