package lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private BookGenre genre;
    private Author author;
    private List<Publication> publicationsList = new ArrayList<>();


    public Book(String title, BookGenre genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public void printShortInfo() {

        System.out.printf("Short info. title: %s, authorName: %s%n", title, author.getName());
        System.out.println( "publications: " + publicationsList.size());

    }

    public void printInfo() {
        System.out.printf("BookInfo. title: %s, genre: %s", title, genre);
        System.out.print(" Author: ");
        author.printInfo();
        System.out.println();

        System.out.println("Book publications ");
        for (Publication publication : publicationsList) {
            publication.printInfo();
        }
        System.out.println("________________");
    }

    public void addPublication(Publication publication) {
        publicationsList.add(publication);
    }

    public List<Publication> getPublicationsList() {
        return publicationsList;
    }




    public String getTittle() {
        return title;
    }

    public void setTittle(String tittle) {
        this.title = tittle;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

