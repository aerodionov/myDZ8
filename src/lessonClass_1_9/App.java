package lessonClass_1_9;


public class App {
    public static void main(String[] args) {
        Author leoTolstoy  = new Author("Лев", "Толстой");
        Author borisPolevoy = new Author("Борис", "Полевой");
        Author leoTolstoy2 = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", leoTolstoy, 1991);
        Book warAndPeace2 = new Book("Война и мир", leoTolstoy, 2000);
        Book storyAboutRealMan = new Book("Повесть о настоящем человеке", borisPolevoy, 1990);
        System.out.println("myBook.getName() = " + warAndPeace.getName());
        System.out.println("myBook.getYearPublication() = " + warAndPeace.getYearPublication());
        System.out.println("myBook.getAuthorName() = " + warAndPeace.getAuthor().getNameAuthor());
        System.out.println("myBook.getAuthorSurname() = " + warAndPeace.getAuthor().getSurnameAuthor());

        warAndPeace.setYearPublication(2000);
        System.out.println("myBook.getYearPublication() = " + warAndPeace.getYearPublication());
        System.out.println();
        System.out.println(warAndPeace.toString());
        System.out.println(leoTolstoy.toString());
        System.out.println(leoTolstoy.equals(leoTolstoy2));
        System.out.println(warAndPeace.equals(warAndPeace2));
        System.out.println(warAndPeace.hashCode() == warAndPeace2.hashCode());

    }
}