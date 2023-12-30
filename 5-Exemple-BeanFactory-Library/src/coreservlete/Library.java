package coreservlete;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Books> books = new ArrayList<>();
    List<Articles> articles =  new ArrayList<>();

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }
}
