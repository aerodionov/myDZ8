package lessonClass_1_9;


public class App {
    public static void main(String[] args) {
        Author leoTolstoy  = new Author("Лев", "Толстой");
        Author borisPolevoy = new Author("Борис", "Полевой");
        Book warAndPeace = new Book("Война и мир", leoTolstoy, 1991);
        Book storyAboutRealMan = new Book("Повесть о настоящем человеке", borisPolevoy, 1990);
        System.out.println("myBook.getName() = " + warAndPeace.getName());
        System.out.println("myBook.getYearPublication() = " + warAndPeace.getYearPublication());
        System.out.println("myBook.getAuthorName() = " + warAndPeace.getAuthor().getNameAuthor());
        System.out.println("myBook.getAuthorSurname() = " + warAndPeace.getAuthor().getSurnameAuthor());

        warAndPeace.setYearPublication(2000);
        System.out.println("myBook.getYearPublication() = " + warAndPeace.getYearPublication());

    }
}